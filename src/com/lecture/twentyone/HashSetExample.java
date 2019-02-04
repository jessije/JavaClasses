package com.lecture.twentyone;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> daysofWeek = new HashSet<>();

        daysofWeek.add("monday");
        daysofWeek.add("tuesday");
        daysofWeek.add("wednesday");
        daysofWeek.add("thursday");
        daysofWeek.add("friday");
        daysofWeek.add("saturday");
        daysofWeek.add("sunday");

        daysofWeek.add("monday");

        System.out.println(daysofWeek);

        Set<String> anotherSet = new HashSet<>();
        anotherSet.addAll(daysofWeek);
        System.out.println(anotherSet);

        if(anotherSet.contains("monday")){
            System.out.println("monday is in the popular cities set");
        }else{
            System.out.println("monday is not in the popular sities set");
        }
        for(String days: anotherSet){
            System.out.println(days);
        }
        anotherSet.remove("monday");
        System.out.println(anotherSet);

        List<String > moreDays = new ArrayList<>();
        moreDays.add("friday");
        moreDays.add("sunday");
        anotherSet.removeAll(moreDays);
        System.out.println(anotherSet);

        Set<Customer> customer = new HashSet<>();

        customer.add( new Customer(101, "Baras"));
        customer.add( new Customer(102, "murat"));
        customer.add( new Customer(103, "asli"));

        customer.add(new Customer(101, "Baras")); // now it will not add (in customer 2nd override)
        customer.add(new Customer(101, "baras")); //it will still add, because caseinsensitive

        }

    }

