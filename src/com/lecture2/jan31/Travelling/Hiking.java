package com.lecture2.jan31.Travelling;

public class Hiking extends HolidayTraveller{



    public Hiking(String destination, String tripDuration, int tripBudget){
        this.destination = destination;
        this.tripDuration = tripDuration;
        this.tripBudget = tripBudget;

    }

    @Override
    public void getVisa(){
        System.out.println("visa was received for 100$");

    }


}
