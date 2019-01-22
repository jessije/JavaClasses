package twentyone;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        numberMapping.put("One", 1);
        numberMapping.put("two", 2);
        numberMapping.put("three", 3);

        numberMapping.putIfAbsent("Four", 4);
        System.out.println(numberMapping);

        String input = "one";
        if(numberMapping.containsKey(input)){
            //get the value assigned to a given key in the HashMap
            int value = numberMapping.get(input);
            System.out.println(input + " is" + value);

        }else{
            System.out.println("no value for " + numberMapping);
        }

        if(numberMapping.containsValue(1)){
            System.out.println("There is a key for the value 1");
        }else{
            System.out.println("the is no key fot the value 1 ");
        }

        numberMapping.put("one", 3);
        System.out.println(numberMapping);

        for(Map.Entry<String, Integer> entry: numberMapping.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getKey());
        }

        numberMapping.remove("one");
        System.out.println(numberMapping);
        boolean isRemoved = numberMapping.remove("two", 3);

                if(isRemoved){
                    System.out.println(" it is removed");
                }else{
                    System.out.println("it is not removed");
                }
        //check if the value exists in a HashMap


    }
}
