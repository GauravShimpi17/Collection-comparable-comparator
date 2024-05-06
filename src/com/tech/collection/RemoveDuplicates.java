package com.tech.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(33);
        nums.add(22);
        nums.add(43);
        nums.add(33);
        nums.add(335);
        nums.add(11);
        nums.add(34);
        nums.add(22);

        //    Using set Interface
        System.out.println("Before removing duplicates : " + nums);
        System.out.println(nums.size());
        Set<Integer> newNums = new LinkedHashSet<>(nums);
        System.out.println("After removing nums : " + newNums);
        System.out.println(newNums.size());

        System.out.println("-----------------");

//        Using loop & without set
        List<Integer> numbers = new ArrayList<>();
        numbers.add(22);
        numbers.add(2);
        numbers.add(32);
        numbers.add(22);
        numbers.add(33);
        numbers.add(43);
        numbers.add(33);
        numbers.add(22);
        numbers.add(22);
        System.out.println("Numbers : " + numbers);
        List<Integer> newNumbers = new ArrayList<>();
        for (int i : numbers) {
            if (!newNumbers.contains(i)) {
                newNumbers.add(i);
            }
        }
        System.out.println("new numbers : " + newNumbers);

    }


}
