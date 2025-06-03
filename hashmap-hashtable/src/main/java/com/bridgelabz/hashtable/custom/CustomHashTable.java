package com.bridgelabz.hashtable.custom;

public class CustomHashTable<K,V> {

    private static final int size = 16;
    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public CustomHashTable(){
        table = new Entry[size];
    }
    private int getIndex(K key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void put(K key, V value){
        int index = getIndex(key);
        Entry<K,V> head = table[index];

        //check if the key is already present
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        //Insert new entry at head
        Entry<K,V> newEntry = new Entry<>(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
    }
    public V get(K key){
        int index = getIndex(key);
        Entry<K,V> curr = table[index];
        while(curr != null){
            if(curr.key.equals(key)){
                return curr.value;
            }
            curr = curr.next;
        }
        return null;
    }
    public void remove(K key){
        int index = getIndex(key);
        Entry<K,V> curr = table[index];
        Entry<K,V> prev = null;
        while(curr != null){
            if(curr.key.equals(key)){
                if(prev == null){
                    table[index] = curr.next;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
}
