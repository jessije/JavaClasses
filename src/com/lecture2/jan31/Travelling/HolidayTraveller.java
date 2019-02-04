package com.lecture2.jan31.Travelling;

public abstract class HolidayTraveller implements Shopping {
    String destination;
    String tripDuration;
    int tripBudget;

    public abstract void getVisa();
    @Override
    public void goShopping(){
        System.out.println("Tourist like to go shopping");
    }
    public void sightseeing(String museum){
        System.out.println("Museum was good");
    }


}
