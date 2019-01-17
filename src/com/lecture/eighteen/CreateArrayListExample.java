package com.lecture.eighteen;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

/**
 * a* Add animals
 *  * dog, cat, tiger, bear, monkey
 *  * print
 *  *
 *  * Does donkey exist = print error.
 *  * print
 *  *
 *  * add the eagle on the 4th index.
 *  * print
 *  *
 *  * create a new list
 *  * put all the items of the animal list to this new list.
 *  *
 */
public class CreateArrayListExample {
    public static void main(String[] args) {

        List<String> animals = new ArrayList<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("tiger");
        animals.add("bear");
        animals.add("monkey");
        System.out.println(animals);

        if (animals.contains("donkey")) {
            System.out.println("it exists");
        }else{
            System.out.println("error");
        }

        animals.add(4, "eagle");
        System.out.println(animals);

        List<String> newList = new ArrayList<>();
        newList.add("cow");
        newList.add("fox");

        newList.addAll(animals);
        System.out.println(newList);



    }
}
