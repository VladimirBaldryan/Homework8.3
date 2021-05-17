package com.company;

public class Circle extends Shape{
    public void getPerimeter() {
        System.out.println(2 * Math.PI * radius);
    }

    public void getArea() {
        System.out.println(Math.PI * Math.pow(radius, 2));
    }
}
