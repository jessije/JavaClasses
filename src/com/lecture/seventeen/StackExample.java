package com.lecture.seventeen;

import java.util.Arrays;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stackofCards = new Stack<>();
        stackofCards.push("Jack");
        stackofCards.push("Queen");
        stackofCards.push("King");
        stackofCards.push("Ace");
        int[] s = new int[7];
        System.out.println(s.toString());
        System.out.println(Arrays.toString(s));
        System.out.println(stackofCards.toString()); // no need to write tostring

        String theLastInfo = stackofCards.pop();
        System.out.println(theLastInfo);

        String cardAtTop = stackofCards.peek(); // s.[s.lenght - 1]
        System.out.println(cardAtTop);
        System.out.println(stackofCards);





    }
}
