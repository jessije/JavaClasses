package com.lecture.eight;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;

    public Person(String name, String surname, int age, String gender) {
        this.name = name; // string name is the same as the name in variable , is the same field i am talking about, to prevent the conflict of the same names
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void printData (){
        System.out.println("name: "+ name+"surname: " + surname + "age: " +age + "gender:" +gender);
    }
}
