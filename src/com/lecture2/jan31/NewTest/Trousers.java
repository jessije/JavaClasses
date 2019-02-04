package com.lecture2.jan31.NewTest;

public class Trousers extends Clothes {
    String name;
    public Trousers(String name) {
        this.name = name;
    }
    @Override
    void wear(){
        System.out.println("trouser " + name + " are expensive ");
    }
}
