package com.tech.shape;

public class Main {

    public static void main(String[] args) {

        Area area = new Area();

        System.out.println("Area of rectangle is : " + area.rectangleArea(5,7));
        System.out.println("Area of square is : " + area.squareArea(4.7));
        System.out.println("Area of circle is : " + area.areaOfCircle(3.44));
    }
}
