package com.bridgelabz.hashmap;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    public static void main(String[] args) {
        //country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();
        //Inserting values in the map
        map.put("India", 126000000);
        map.put("China", 1370000000);
        map.put("USA", 320000000);
        map.put("Japan", 126500000);
        map.put("Brazil", 204500000);

        //searching the value
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("India"));
        System.out.println(map.get("America"));
        int arr[] = {10,20,30};
        //iterating the values using for loop
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Size of the map is " + map.size());
        //iterating the values using for each loop
        for(int val : arr){
            System.out.println(val + " ");
        }
        Map.Entry<String, Integer> e = map.entrySet().iterator().next();
        System.out.println(e);

        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println(map);
    }
}
