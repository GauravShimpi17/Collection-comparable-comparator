package com.tech.iterator;

import java.util.*;

public class Cars {

    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.size());
        Iterator<String> it = cars.iterator();

        List < String> list = new LinkedList<>();

        System.out.println(it.next().toUpperCase());
        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }


}
