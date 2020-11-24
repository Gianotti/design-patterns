package com.conexia.designPatterns.singleton;

import static java.util.Objects.isNull;

public class SingletonConection {


    private static SingletonConection instance;


    private SingletonConection() {
    }

    public static SingletonConection getInstance() {
        if (isNull(instance)) {
            instance = new SingletonConection();
        }
        return instance;
    }

    public void connect(){
        System.out.println("connection successfully");
    }

    public void disconnect(){
        System.out.println("disconnection successfully");
    }

}
