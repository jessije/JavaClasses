package com.lecture2.jan31.Travelling;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        HolidayTraveller holidayTraveller = new Hiking("Nepal", "2 weeks", 1000 );
        BusinessTraveller businessTraveller = new Seminars("Estonia", 2, 500);

        List<Shopping> shoppers = new ArrayList<>();
        shoppers.add(holidayTraveller);
        shoppers.add(businessTraveller);

        goShopping(shoppers);
    }

    static void goShopping(List<Shopping> shoppers){
        for(Shopping shopper :shoppers){
            shopper.goShopping();
        }
    }
}
