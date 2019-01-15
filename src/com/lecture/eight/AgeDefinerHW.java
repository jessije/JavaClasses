package com.lecture.eight;
import java.util.Scanner;
public class AgeDefinerHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your gender?");
        String gender = scanner.next();

        System.out.println("gender is " + gender);

        if (gender.equalsIgnoreCase("female")) {
            System.out.println("what is you age");
            int ageOfWoman = scanner.nextInt();
            {
                AgeDefiner ageDefiner = new AgeDefiner();
                ageDefiner.womanAge(ageOfWoman);
            }
        }else if(gender.equalsIgnoreCase("male")) {
            System.out.println("what is you age");
            int ageofMan = scanner.nextInt();
            {
                AgeDefiner ageDefiner = new AgeDefiner();
                ageDefiner.manAge(ageofMan);
            }

        }else if(gender!="female"|| gender!="male")
            System.out.println("please enter the correct gender");
        }

        }


