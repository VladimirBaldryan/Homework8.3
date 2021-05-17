package com.company;

public class Square extends Shape{
    public void getArea() {
        System.out.println(Math.pow(radius, 2));
    }
    public void getPerimeter() {
        System.out.println(4 * radius);
    }
}
