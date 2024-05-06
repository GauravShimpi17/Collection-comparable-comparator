package com.tech.comparable;

public class Employee implements Comparable<Employee>{

    private String name;
    private int id;
    private int phoneNo;

    public Employee(String name, int id, int phoneNo) {
        this.name = name;
        this.id = id;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }
}
