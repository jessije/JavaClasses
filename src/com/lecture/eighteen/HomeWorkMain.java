package com.lecture.eighteen;

import com.lecture.eight.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class HomeWorkMain {
    public static void main(String[] args) {
        //I am adding 5 people to the
        HomeWork person1 = new HomeWork("Lena", 24);
        HomeWork person2 = new HomeWork("Murat", 24);
        HomeWork person3 = new HomeWork("Dmitri", 25);
        HomeWork person4 = new HomeWork("Roman", 45);
        HomeWork person5 = new HomeWork("Asli", 27);

        List<HomeWork> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        Iterator itr = persons.iterator();
        while (itr.hasNext()) {
            HomeWork pers = (HomeWork) itr.next();
            System.out.println(pers.name + " " + pers.age);

        }
        System.out.println("");

        for (HomeWork someone : persons) {
            System.out.println(someone.getName() + " " + someone.getAge());
        }

    }
}