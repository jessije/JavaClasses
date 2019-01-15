public class StringOperations {

    public static void main(String[] args) {
        String helloWorld = "Hello,world";
        String someString = helloWorld.substring(2,7);
        System.out.println(someString);

        String someString1 = helloWorld.substring(5);
        System.out.println(someString1);


        int lengthOfString = helloWorld.length();
        System.out.println(lengthOfString); //12--11

        int indexOfComma = helloWorld.indexOf(",");
        System.out.println(indexOfComma); // 5--6

        int lastIndexOf0 = helloWorld.lastIndexOf("o");
        System.out.println(lastIndexOf0);






    }
}
