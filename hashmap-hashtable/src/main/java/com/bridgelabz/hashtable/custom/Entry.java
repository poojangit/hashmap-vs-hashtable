package com.bridgelabz.hashtable.custom;

public class Entry<K,V> {
    K key;
    V value;
    Entry<K,V> next;
    Entry(K key, V value){
        this.key = key;
        this.value = value;
    }
}
