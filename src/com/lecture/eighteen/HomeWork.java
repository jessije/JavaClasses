package com.lecture.eighteen;

public class HomeWork {

    /**
     * 1. create person class (2 fields, name and age)
     * it will contain name and age field, you can create constructor (like wizard) - constuctor
     * <p>
     * 2. create another class, it will contain main method
     * you will create 5 person objects, put them in the arraylist, then print them out
     * <p>
     * the name and the age (pirnt)
     */

    String name;
    int age;

    public HomeWork(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
