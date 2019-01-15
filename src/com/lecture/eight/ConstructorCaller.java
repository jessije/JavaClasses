package com.lecture.eight;

public class ConstructorCaller {
    public static void main(String[] args) {
        Person person = new Person(" Beyonce", " Know", 45, "female"); // i am creating an object and i am using a constructor with new values)
       person.printData();
        VarArgsExample varArgsExample = new VarArgsExample(); // defining new object
        int result = varArgsExample.sum(1,2,3,5,7,8); // sum is a method, we are using object sum method , we use sume method of the object, it will be assigned to the "result" variable

        System.out.println("Result: "+result); // gives the rusalt variable  value
        AgeDefiner ageDefiner = new AgeDefiner();
        ageDefiner.womanAge(123,12,3,2,7,123,85,23,12,45);
        ageDefiner.manAge(12,21,6,3,12,32,46,65,42);

    }
}
