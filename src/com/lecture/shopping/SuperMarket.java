package com.lecture.shopping;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SuperMarket {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<String> productList = new ArrayList<>();
            Product product = new Product();

            System.out.println("Welcome admin.");
            while (true) {
                System.out.println("What do you want to do: Add or Remove item ? Type Done when finished ?");
                String customerInput = scanner.next();
                if (customerInput.equalsIgnoreCase("done")) {
                    System.out.println("Thank you for shopping");

                    break;
                } else if (customerInput.equalsIgnoreCase("add")) {
                    System.out.println("Please enter product name:");
                    String inputName = scanner.next();
                    if (productList.isEmpty() || !productList.contains(inputName)) {
                        product.setProductName(inputName);
                        productList.add(inputName);
                        System.out.println("Please enter Price for " + inputName);
                        double inputPrice = scanner.nextDouble();
                        product.setProductPrice(inputPrice);
                        productList.add(inputName);
                    } else {
                        System.out.println(inputName + " already exists");
                    }
                    System.out.println(productList);


                }
            }
            /*for (Product someproduct : productList) {
                System.out.println(someproduct.getProductName() + " " + someproduct.getProductPrice());
            }*/
        }
    }

