package com.tech.shape;

public class Area extends Shape{
    @Override
    double rectangleArea(double length, double width) {
        return length*width;
    }

    @Override
    double squareArea(double side) {
        return side*side;
    }

    @Override
    double areaOfCircle(double radius) {
        return PI * radius*radius;
    }
}
