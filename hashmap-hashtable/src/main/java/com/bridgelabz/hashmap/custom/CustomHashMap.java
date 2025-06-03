package com.bridgelabz.hashmap.custom;

public class CustomHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final double LOAD_FACTOR = 0.75;

    private Node<K,V>[] buckets;
    private int size = 0;

    public CustomHashMap(){
        buckets = new Node[DEFAULT_CAPACITY];
    }
    private int getBucketIndex(K key){
        return Math.abs(key.hashCode()) % buckets.length;
    }

    public void put(K key, V value){
        int index = getBucketIndex(key);
        Node<K,V> head = buckets[index];
        //check if the key is present and update
        for(Node<K,V> current = head; current != null; current = current.next){
            if(current.key.equals(key)){
                current.value = value;
                return;
            }
        }
        //Insert at beginning
        Node<K,V> newNode = new Node<>(key,value);
        newNode.next =head;
        buckets[index] = newNode;
        size++;
        //Resize if load factor is greater than 0.75
        if((1.0*size)/buckets.length >= LOAD_FACTOR){
            resize();
        }
    }
    public V get(K key) {
        int index = getBucketIndex(key);
        Node<K,V> curr = buckets[index];
        while(curr != null){
            if(curr.key.equals(key)){
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }
    public boolean containsKey(K key) {
        return get(key) != null;
    }
    public int size() {
        return size;
    }

    public void remove(K key){
        int index = getBucketIndex(key);
        Node<K,V> curr = buckets[index];
        Node<K,V> prev = null;
        while(curr != null){
            if(curr.key.equals(key)){
                if(prev == null){
                    buckets[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                size--;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
    @SuppressWarnings("unchecked")
    private void resize(){
        Node<K,V>[] oldBuckets = buckets;
        buckets = new Node[oldBuckets.length*2];
        size = 0;
        for(Node<K,V> head : oldBuckets){
            while(head != null){
                put(head.key, head.value);
                head = head.next;
            }
        }
    }
}
