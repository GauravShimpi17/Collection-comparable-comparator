package com.tech.collection;

import java.util.HashMap;
import java.util.Map;

public class Demo {


    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add some key-value pairs
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);

        // Display the original HashMap
        System.out.println("Original HashMap: " + hashMap);

        // Replace each value with its square
        hashMap.replaceAll((key, oldValue) -> oldValue * oldValue);

        // Display the modified HashMap
        System.out.println("Modified HashMap: " + hashMap);
    }
}