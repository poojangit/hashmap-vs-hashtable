package com.bridgelabz.hashmap;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        String[] words = {"pooja","preethi", "pachuu"};
        HashMap<String, Integer> freq = new HashMap<>();
        for(String word: words) {
            freq.put(word, freq.getOrDefault(word,0)+ 1);
        }
        System.out.println(freq);
    }
}
