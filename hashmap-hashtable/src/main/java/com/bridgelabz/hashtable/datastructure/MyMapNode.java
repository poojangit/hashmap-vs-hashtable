package com.bridgelabz.hashtable.datastructure;

public class MyMapNode<K,V> {
    //key and value
    K key;
    V value;

    //Constructor
    public MyMapNode(K key, V value){
        this.key = key;
        this.value = value;
    }
    //getter and setter
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
    //toString method
    @Override
    public String toString(){
        return key + " : " + value;
    }
}
