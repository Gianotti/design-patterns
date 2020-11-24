package com.conexia.designPatterns.facade;

public class Square implements Shape {

    public Square() {
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
