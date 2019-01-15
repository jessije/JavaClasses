
import java.util.Scanner;

public class ValueInput {
    public static void main(String[] args) {
        boolean isHungry;
        int chikenKg;
        double cost;
        float drinkCost;
        char secretCode;


        short littleNumber;
        long bigNumber;

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter for data for is Hungry (boolean)");
        isHungry = scanner.nextBoolean();
        if (isHungry) {
            System.out.println("I am hungry");
        } else {
            System.out.println("I am not hungry");
        }
        System.out.println("how many kg of chicken to buy (int)?");
        chikenKg = scanner.nextInt();
        System.out.println("please buy " + chikenKg + "kg of chicken");

        System.out.println("how much chicken costs (double)?");
        cost = scanner.nextDouble();
        System.out.println("It costs " + cost + " euros");

        System.out.println("how much milk costs (float)?");
        drinkCost = scanner.nextInt();
        System.out.println("It costs " + drinkCost + " euros");

        if (cost > drinkCost) {
            System.out.println("Food costs more than drink");
        } else {
            System.out.println("Drink cost more (or equal) than food");
        }
        System.out.println("what is a secret code? (char)");
        secretCode = scanner.next().charAt(0);
        System.out.println("it is " + secretCode);

        if (secretCode == 'd') {
            System.out.println("it is correct");
        } else {
            System.out.println("it doesn't match");
        }
        System.out.println("What is a little number?");
        littleNumber = scanner.nextShort();
        System.out.println("it is " + littleNumber);

        if (littleNumber > 7) {
            System.out.println("it doesn't match");
        } else {
            System.out.println("It's okay");
        }

        System.out.println("what is a big number?");
        bigNumber = scanner.nextLong();
        System.out.println("it is " + bigNumber);

        if (bigNumber < 1000000) {
            System.out.println("it is not big enough");
        } else {
            System.out.println("it's okay");
        }
    }
}




