package com.tech.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmp {
    public static void main(String[] args) {
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Gaurav", 12,545435534));
        emp.add(new Employee("Vijay", 132,545435534));
        emp.add(new Employee("Aarav", 66,545435534));
        System.out.println(emp);
        Collections.sort(emp,new IdComparator());
        System.out.println(emp);

        ArrayList<Employee> emp1 = new ArrayList<>(emp);

        Collections.sort(emp1,new NameComparator());
        System.out.println(emp1);

    }

}
