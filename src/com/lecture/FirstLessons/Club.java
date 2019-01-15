
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Club {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");

        String myName = scanner.next();

        if (myName.equalsIgnoreCase("Jelena")) {
            System.out.println(" go away" + myName);
        } else {
            System.out.println("tell me you age " + myName);
            int age = scanner.nextInt();

            if (age < 18) {
                System.out.println(" go home " + myName);

            } else {
                System.out.println("come in, " + myName);
            }


        }
    }
}
