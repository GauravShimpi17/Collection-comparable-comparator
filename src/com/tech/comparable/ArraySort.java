package com.tech.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraySort {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Aarav", 12, 123123123));
        emp.add(new Employee("Gaurav", 11, 343423232));
        emp.add(new Employee("Hemil", 15, 343453443));

        System.out.println(emp);
        System.out.println("comparable");
        Collections.sort(emp);
        System.out.println(emp);
    }

}
