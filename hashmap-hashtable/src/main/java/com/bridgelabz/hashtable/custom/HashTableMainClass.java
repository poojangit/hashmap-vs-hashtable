package com.bridgelabz.hashtable.custom;

public class HashTableMainClass {
    public static void main(String[] args) {
        CustomHashTable<String, Integer> map = new CustomHashTable<>();
        map.put("apple", 10);
        map.put("Kiwi",20);
        map.put("Orange", 30);
        System.out.println("Apple = " + map.get("apple"));
        System.out.println("Kiwi = " + map.get("Kiwi"));
        map.remove("Orange");
        System.out.println("Orange after removing = " + map.get("Orange"));
    }
}
