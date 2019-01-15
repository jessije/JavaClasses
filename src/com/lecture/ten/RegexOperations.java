package com.lecture.ten;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexOperations {
    public static void main(String[] args) {
        /**
         * pattern object is the compiletd version of the regular expression
         * patternac class doesnt have any public constructon and we use its public static methos compile to
         * create pattern objest
         * by passbing regular expression argument
          */

        Pattern pattern = Pattern.compile (".xx.");
       Scanner scanner = new Scanner(System.in);
        String someDummyString = scanner.nextLine();

        Matcher matcher = pattern.matcher( "MxxY");
        System.out.println("Input String matches the regex - "+ matcher.matches());

        //* matches Any single characher
        Pattern pattern1 = Pattern.compile ("(?i)..xx.");
        Matcher matcher1 = pattern1.matcher(someDummyString);
        System.out.println("Input String matches "+ matcher1.matches());

        /**
         *
         */
        System.out.println("Using the String matches - " +
                someDummyString.matches("^xxx"));

        String anotherString1 = "a1c11";
        System.out.println("Using String matches method: "+ anotherString1.matches("^a.c."));
        System.out.println("Using String matches method: " +anotherString1.matches("^a1..."));

        String anotherString2 = "a1c11";
        System.out.println("\"Using String matches method:"+ anotherString2.matches("..11$"));
        System.out.println("Using String matches method: "+ anotherString2.matches("...11$"));

        /**
         * [abs] can match any of the letter a, b, c []are known as charecter classe.
         *
         */

        //anotherString2="ab";
        //System.out.println("Sting String matches method: "+ anotherString2.matches);

        /**
         * [abc][12] can match a, b or c followed by 1 or 2
         *
         */
         String anotherString4 ="a1";
        System.out.println("using string matches method" +anotherString4.matches("[abc][12]"));
        System.out.println("sing string matches method " + anotherString4.matches("[abc]"));

        /**
         * common matching symbols
         * [^abc] when ^ is the first in [], it negates the patterm
         * matches anything except a,b or c
         */
        String anotherString5 = "s3#";
        System.out.println("using string matches method " + anotherString5.matches("[^abc]"));
        System.out.println("using string matches method " + anotherString5.matches("[abc].."));
        System.out.println("using string matches method " + anotherString5.matches("[^abc].."));

/**
 * [a-e1-8] matches ranges between a to e or 1 to 8
 */
String anotherString6 = "a2#";
        System.out.println("using string matches method " + anotherString6.matches("[a-e1-8]"));
        System.out.println("using string matches method " + anotherString6.matches("[a-e1-8].."));

        /**
         * skopirovat s file MurATA
         */


    }
}
