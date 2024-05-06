package com.tech.collection;

import java.util.ArrayList;
import java.util.List;

public class Position {
    public static void main(String[] args) {

        List <String> list_col = new ArrayList<>();
        list_col.add("Black");
        list_col.add("Blue");
        list_col.add("Green");
        list_col.add("Orange");
        list_col.add("Pink");
        list_col.add("Purple");
        list_col.add("White");
        list_col.add("Yellow");
        System.out.println("Colors List :" + list_col);


//        Check the position of specific element in list

        System.out.println("Index of color Blue is " + list_col.indexOf("Blue"));
        System.out.println("Index of color Purple is " + list_col.indexOf("Purple"));

//        Replace particular elements in list
        System.out.println("Before replacement : " + list_col);
        list_col.set(3,"Peach");
        System.out.println("After replacement : " + list_col);

//        Make a sublist from a main arraylist
        List <String> subList = list_col.subList(2,5);
        System.out.println(subList);
//        System.out.println(list_col);



    }
}
