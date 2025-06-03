package com.bridgelabz.hashtable.datastructure;

import java.util.LinkedList;

public class MyLinkedHashMap<K,V> {
    private final int NUM_BUCKETS = 10;
    LinkedList<MyMapNode<K,V>>[] buckets;
    public MyLinkedHashMap(){
        buckets = new LinkedList[NUM_BUCKETS];
        for(int i=0; i<NUM_BUCKETS; i++){
            buckets[i] = new LinkedList<>();
        }
    }
    private int getBucketIndex(K key){
        return Math.abs(key.hashCode()) % NUM_BUCKETS;
    }
    public V get(K key){
        //check if the key is present
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K,V>> bucket = buckets[index];
        for(MyMapNode<K,V> node : bucket){
            if(node.getKey().equals(key)){
                return node.getValue();
            }
        }
        return null;
    }
    public void put(K key, V value){
        //check if the key is present
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K,V>> bucket = buckets[index];
        for(MyMapNode<K,V> node : bucket){
            if(node.getKey().equals(key)){
                node.setValue(value); //update the value
                return;
            }
            //not found -> add new

        }
        //add new
        bucket.add(new MyMapNode<>(key, value));
    }
    //UC3-Implementation
    public void remove(K key){
        int index = getBucketIndex(key);
        LinkedList<MyMapNode<K,V>> bucket = buckets[index];
        MyMapNode<K,V> nodeToRemove = null;
        for(MyMapNode<K,V> node : bucket){
            if(node.getKey().equals(key)){
                nodeToRemove = node;
                break;
            }
        }
        if(nodeToRemove != null){
            bucket.remove(nodeToRemove);
            System.out.println("Removed: " + key);
        } else {
            System.out.println("word not found: " + key);
        }
    }
    public void printMap(){
        for(LinkedList<MyMapNode<K,V>> bucket : buckets){
            for(MyMapNode<K,V> node : bucket){
                System.out.println(node);
            }
        }
    }
}
