package com.lecture.nine;

public class StringOperations {
    public static void main(String[] args) {
        String name= "Dmitri";
        name =name.replace("tri", "");

        String anotherStringName="Murat is rat";
        String anotherStringNames =anotherStringName.replaceAll("rat", "god");
        System.out.println(anotherStringNames);



    }
}
