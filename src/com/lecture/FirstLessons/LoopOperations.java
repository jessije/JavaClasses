public class LoopOperations {
    public static void main(String[] args) {
        int counter = 3;
        while (counter > 1) {
            System.out.println(counter);
            counter--; // itearation, counter ==counter -1 only runs while expression is true , "if" runs only once
        }
        String helloWorld = "hello, world";
        int characterCount = 0;//counting of charecter , index counting
        // int lenghofString=helloWorld.length(); is the same

        while (helloWorld.length() > characterCount) { //as long as lenght of charecterword bigger than 0 do this operation
            System.out.print(helloWorld.charAt(characterCount));
            characterCount++;
        }
        System.out.println();
        for (characterCount = 0; characterCount < helloWorld.length(); characterCount++)
        {
            System.out.print(helloWorld.charAt(characterCount));
        }
    }
}


