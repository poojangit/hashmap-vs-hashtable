package com.bridgelabz.hashtable.datastructure;

//UC2 - Implementation for large paragraph
public class ParagraphFrequencyTest {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoids because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");
        MyLinkedHashMap<String , Integer> map = new MyLinkedHashMap<>();
        for(String word : words){
            Integer count = map.get(word);
            if(count == null){
                map.put(word, 1);
            } else {
                map.put(word, count+1);
            }
        }
        //UC3 - Implementation for removing a word from the map
        System.out.println("Before removal: ");
        map.printMap();
        //Remove  "avoidable"
        map.remove("avoidable");
        System.out.println("\nAfter removal: ");
        map.printMap();
    }
}
