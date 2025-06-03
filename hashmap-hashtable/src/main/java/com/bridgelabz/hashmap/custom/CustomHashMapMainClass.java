package com.bridgelabz.hashmap.custom;

public class CustomHashMapMainClass {
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("pooja", 10);
        map.put("pachuu", 20);
        map.put("prithee", 30);
        System.out.println("Pooja = " + map.get("pooja"));
        System.out.println("Contains prithee? " + map.containsKey("prithee"));
        map.remove("pachuu");
        System.out.println("After removing pachuu = " + map.get("pachuu"));
        System.out.println(map.size());
    }
}
