package com.lecture2.jan31.Inheritance;

public class Vehicle {
    protected int maxSpeed;
    private int numSeats;
    protected String fuelType;

    void ride() {
        System.out.println("Just riding it");
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getNumSeats() {
        return numSeats;
    }
    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }
    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}

