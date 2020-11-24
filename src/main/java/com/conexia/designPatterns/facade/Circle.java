package com.conexia.designPatterns.facade;

public class Circle implements Shape {

    public Circle() {
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
