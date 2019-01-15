package com.lecture.eight;

public class AgeDefiner {


    /**
     *  <18 you are very young
     *  18-31 you are still young
     *  32-45 game over
     *  46- ... are you still alive
     */

    /**
     * 2 methods. One is for woman the other for man
     *
     * Woman: <18  you are very young
     * 18-45 you are young
     * 46-60 you are still young
     * 61-... You were young.
     */
    public void womanAge(int... womanAges){

        for(int ageOfWoman:womanAges){
            if(ageOfWoman<0){
                System.out.println("age can't be negative");
                System.exit(0); // System.exit(status 0)
            }
            else if(ageOfWoman<18){
                System.out.println("you are very young");
            }else if(ageOfWoman>18 && ageOfWoman<45){
                System.out.println("you are young");
            }else if(ageOfWoman>46 && ageOfWoman<60){
                System.out.println("you are still young");
            }else{
                System.out.println("you were young");
            }
        }
    }
public void manAge(int...manAges){
        for(int ageofMan:manAges){
            if(ageofMan<18){
                System.out.println("you are very young");
            }else if(ageofMan>18 && ageofMan<31){
                System.out.println("you are still young");
            }else if(ageofMan>32 &&ageofMan<45){
                System.out.println("game over");
            }else{
                System.out.println("are you still alive?");
            }
        }
}



}
