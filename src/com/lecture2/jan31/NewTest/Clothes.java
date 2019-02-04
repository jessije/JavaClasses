package com.lecture2.jan31.NewTest;

public class Clothes {
    protected int size;
    protected String brand;
    protected int Price;


    void wear(){
        System.out.println("just wear it");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}