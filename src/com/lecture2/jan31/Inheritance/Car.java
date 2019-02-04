package com.lecture2.jan31.Inheritance;

public class Car extends Vehicle {
    String name;
    public Car(String name) {
        this.name = name;
    }

    @Override // to mention that this method is overriden from Vehicle
    void ride(){

        System.out.println(" car " + name + " is riding");
    }
}
