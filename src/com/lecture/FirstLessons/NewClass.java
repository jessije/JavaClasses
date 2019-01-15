import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class NewClass {
    public static void main(String[] args) {
        boolean isHungry = true;
        int chikenKg = 1;
        double cost = 1.20;
        float drinkCost = 1.01f;
        char secretCode = 'c';


        short littleNumber = 3;
        long bigNumber = 1000000;
        if (isHungry) {
            System.out.println("I am hungry");
        } else {
            System.out.println("I am not hungry");
        }
        System.out.println("I ate " + chikenKg + "kg chicken");

        System.out.println("Chicken costs " + cost + " euros");
        System.out.println("Milk costs " + drinkCost + " euros");

        if (cost > drinkCost) {
            System.out.println("Food costs more than drink");
        } else {
            System.out.println("Drink cost more (or equal) than food");
        }
// lets assume our secret code is D

        if (secretCode == 'd') {
            System.out.println("secret code is correct");
        } else {
            System.out.println("doesn't match");
        }

        byte b = 10;
        byte c = 0x0A;
        System.out.println("byte value " + b);
        System.out.println("byte value " + c);

        if (littleNumber < 7) {
            System.out.println("your password is too short");
        } else {
            System.out.println("your password is too long");
        }
        //compare bug number 992525
        if (bigNumber < 992525) {
            System.out.println("your number is big enough");
        } else {
            System.out.println("your number is too small");
        }

    }

}



