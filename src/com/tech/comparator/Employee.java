package com.tech.comparator;

public class Employee {
    private String name;
    private int id;
    private int phone;

    public Employee(String name, int id, int phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
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

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", phone=" + phone +
                '}';
    }
}
