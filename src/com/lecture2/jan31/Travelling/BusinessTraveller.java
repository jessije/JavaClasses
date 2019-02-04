package com.lecture2.jan31.Travelling;

public abstract class BusinessTraveller implements Shopping {


    String departurePlace;
    int numberVisitedPlaces;
    double totalBudget;


    public abstract void getTicket();

    @Override
    public void goShopping(){
        System.out.println("no time for Shopping");

    }
    public void sightseeing(){
        System.out.println("no time for sightseeing");
    }

}

