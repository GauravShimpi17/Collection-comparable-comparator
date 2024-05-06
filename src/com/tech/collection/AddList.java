package com.tech.collection;

import java.util.LinkedList;
import java.util.List;

public class AddList {
    public static void main(String[] args) {

//        Add all elements of a list to specified index of another list

        List<String> l1 = new LinkedList<>();
        l1.add("Banana");
        l1.add("Papaya");
        l1.add("Apple");
        l1.add("Strawberry");
        l1.add("Chiku");

        List<String> l2 = new LinkedList<>();
        l2.add("PineApple");
        l2.add("Custard");
        l2.add("Watermelon");

        System.out.println("Before adding : " + l1);
        l1.addAll(l2);
        System.out.println("After adding : " +l1);
    }
}
