package com.lecture2.jan31.Inheritance;

public class Bus extends Vehicle {
    @Override
    void ride() {
        maxSpeed = 12;
        System.out.println("Bus is  ");
    }
}
