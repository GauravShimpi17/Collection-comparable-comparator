package com.tech.serialization.is_a;

public class Child extends Parent{

    private String course;
    private int fee;

    public Child(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Child{" +
                "course='" + course + '\'' +
                ", fee=" + fee +
                '}';
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }
}
