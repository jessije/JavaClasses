package com.lecture.ten;
import java.util.Scanner;

public class IdSurname1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("print name ");
            String name = scanner.nextLine();
            if (name.matches("[a-zA-Z0-9]*" )) {
                System.out.println("name is correct");
                break;
            } else {
                System.out.println("name is not correct");
            }

    }
          while (true) {
              System.out.println("print surname");
              String surname = scanner.nextLine();
              if (surname.matches("[a-zA-Z0-9]*")) {
                  System.out.println("surname is correct");
                  break;
              } else {
                  System.out.println("surname is not correct");
              }
          }
              while(true) {
                  System.out.println("print ID");
                  String id = scanner.nextLine();
                  if(id.matches("[0-9]*")){
                      System.out.println("ID is correct");
                      break;
                  }else{
                      System.out.println("ID is not correct");
                  }
            }
        }
    }







