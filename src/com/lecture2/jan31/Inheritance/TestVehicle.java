package com.lecture2.jan31.Inheritance;


public class TestVehicle {
    public static void main(String[] args) {
//        Vehicle vehicle = new Car();
//        vehicle.ride();
//        vehicle = new Bus();
//        vehicle.ride();


        Vehicle[] vehicles = new Vehicle[]{
                new Car("volvo"),
                new Bus(),
                new Car("bmw"),
                new Bicycle()
        };
        rideAllVehicles(vehicles);
    }
    public static void rideAllVehicles(Vehicle[] all){

        for(Vehicle vehicle: all){
            vehicle.ride();
        }
    }
}
