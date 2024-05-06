package com.tech.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Colors {

    public static void main(String[] args) {
        List <String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Orange");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Blue");

        for ( String color : colors){
            System.out.print(color + " ");
        }

        List <String> nan = new ArrayList<>();

        colors.stream().map(color -> color+ " color").collect(Collectors.toCollection(() -> nan));
        System.out.println( );
        for (String n : nan ){
            System.out.println(n);
        }
        System.out.println("---------------");
        List <String> list_col = new ArrayList<>();
        list_col.add("Black");
        list_col.add("Blue");
        list_col.add("Green");
        list_col.add("Orange");
        list_col.add("Pink");
        list_col.add("Purple");
        list_col.add("White");
        list_col.add("Yellow");
        System.out.println("Before Shuffling :" + list_col);
        Collections.shuffle(list_col);
        System.out.println("After Shuffling :" + list_col);
// contains method
        System.out.println("Is white color present is list_col " + "\n"+ list_col.contains("White"));

    }
}
