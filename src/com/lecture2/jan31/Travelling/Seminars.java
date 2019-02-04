package com.lecture2.jan31.Travelling;

public class Seminars extends BusinessTraveller {

    public Seminars(String departurePlace, int numberVisitedPlaces, double totalBudget ){
        this.departurePlace=departurePlace;
        this.numberVisitedPlaces = numberVisitedPlaces;
        this.totalBudget=totalBudget;
    }
    @Override
    public void getTicket(){
        System.out.println("ticket was paid by company");
    }
    @Override
    public void sightseeing(){
        System.out.println("no time for this");
    }

}
