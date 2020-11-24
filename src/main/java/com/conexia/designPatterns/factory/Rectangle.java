package com.conexia.designPatterns.factory;

public class Rectangle implements Shape {

    public Rectangle() {
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
