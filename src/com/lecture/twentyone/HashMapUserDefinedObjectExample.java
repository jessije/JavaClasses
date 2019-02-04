package com.lecture.twentyone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedObjectExample {
    public static void main(String[] args) {
        Map<Integer, Customer> employeesMap = new HashMap<>();
        employeesMap.put(1, new Customer(1, "Basaran"));
        employeesMap.put(2, new Customer(2, "Mohsen"));
        employeesMap.put(3, new Customer(3, "Baris"));


        for (Map.Entry<Integer, Customer> entry : employeesMap.entrySet()) {
            Customer iteratedCustomer = entry.getValue();
            if (iteratedCustomer.getName().equalsIgnoreCase("basaran")) {
                System.out.println(iteratedCustomer);

            }
        }

        //to remove Basaran
        ArrayList<Integer> basarantobeRemoved = new ArrayList<>();
        for (Map.Entry<Integer, Customer> entry : employeesMap.entrySet()) {
            Customer iteratedCustomer = entry.getValue();
            if (iteratedCustomer.getName().equalsIgnoreCase("basaran")) {
                basarantobeRemoved.add(entry.getKey());
            }
        }
        for(Integer key: basarantobeRemoved){
            employeesMap.remove(key);
        }
        System.out.println(employeesMap);
    }
}


