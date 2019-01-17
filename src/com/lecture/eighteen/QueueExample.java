package com.lecture.eighteen;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Romans");
        waitingQueue.add("Mohsen");
        waitingQueue.add("Asli");
        waitingQueue.add("Janek");

        System.out.println(waitingQueue);

        String name = waitingQueue.remove(); // (the dequeue operation
        System.out.println(name);

        name = waitingQueue.poll();
        System.out.println(name);

        System.out.println(waitingQueue);
    }
}
