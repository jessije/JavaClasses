package com.lecture.eighteen;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();

        friends.add("Mohsen");
        friends.add("Baris");
        friends.add("Sander");
        friends.add("Karu");

        System.out.println(friends);

        friends.add(3, "Canberk");
        System.out.println(friends);

        friends.add("jelena");
        System.out.println(friends);

        friends.add("murat");
        System.out.println(friends);

        List<String> dissapearedList = new ArrayList<>();
        dissapearedList.add("elvis");

        friends.addAll(dissapearedList);
        System.out.println(friends);

    }
}
