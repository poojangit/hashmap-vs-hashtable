package com.bridgelabz.hashtable.datastructure;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String sentence = "To be or not to be";
        String[] words = sentence.toLowerCase().split(" ");
        MyLinkedHashMap<String , Integer> map = new MyLinkedHashMap<>();
        for(String word : words){
            Integer count = map.get(word);
            if(count == null){
                map.put(word, 1);
            } else {
                map.put(word, count+1);
            }
        }
        map.printMap();
    }
}
