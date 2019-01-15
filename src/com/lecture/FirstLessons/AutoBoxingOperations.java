public class AutoBoxingOperations {
    public static void main(String[] args) {
        int someNumber = 2;
        Integer someObjectInteger = someNumber;
        Integer someObjectInteger1 = new Integer(someNumber);

        int anotherInteger = someObjectInteger;

        System.out.println(someNumber + "" + someObjectInteger1 + "" + anotherInteger + "" + someObjectInteger);

        float someDoubleNumber = 2123.999f;
        Float objectFloatNumber = someDoubleNumber;
        System.out.println(objectFloatNumber);
        System.out.println(objectFloatNumber.intValue());

        int anotherNumber = 23;
        Integer anotherNumber1 = 24;
        if (anotherNumber == anotherNumber1) {
            System.out.println("these numbers are same");
        } else {
            System.out.println("these numbers are not same");
            Integer number1 = 1;
            Integer number2 = 1;
            if (number1 == number2) {
                System.out.println("these numbers are same");
            }

            Double double1 = 123.29;
            Double double2 = 100.20;

            int result = double1.compareTo(double2);
            System.out.println(result);
        }
        String myName = "Jelena";
        if (myName == "Jelena") {
            System.out.println("this actually prints");
        }

        if (myName.equals("Jelena")) {
            System.out.println("hello " + myName);
        }
        if (myName.equals("jelena")) {
            System.out.println("Hello again" + myName);
        }

        }
    }

