public class BiggestNumber {

    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 3;
        int result = a + b;

        if ((a > b) && (a > c)) {
            System.out.println(a);
        }
        if ((b > c) && (b > a)) {
            System.out.println(b);
        }
        if (c > b) { // <---instead could be }else{
            System.out.println(c);
        }
        System.out.println("Result is " + result);
    }
}

//int result = a+b
//sout("Result is" + result)
