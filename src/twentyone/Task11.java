package twentyone;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] items = {"", "", "", "", ""};
        int totalAmountOfItems = 0;

        while (true) {
            System.out.println("What operation do you want to do? Add/remove/view/search/done");
            String command = scanner.nextLine();
            if (!command.equalsIgnoreCase("add") && !command.equalsIgnoreCase("view") &&
                    !command.equalsIgnoreCase("remove") && !command.equalsIgnoreCase("search") &&
                    !command.equalsIgnoreCase("done")) {
                System.out.println("wrong command");
                continue;
            }
            if (command.equalsIgnoreCase("add")) {

                if (totalAmountOfItems == items.length) {
                    System.out.println("Array is full. We cannot add any item.");
                } else {
                    System.out.println("What item you want to add?");
                    String itemAdded = scanner.nextLine();

                    boolean found = false;

                    for (int counter = 0; counter < items.length; counter++) {
                        if (items[counter].equalsIgnoreCase(itemAdded)) {
                            System.out.println("Item located at index " + counter + " No need to add.");
                            found = true;
                        }
                    }
                    if (!found) {
                        for (int counter = 0; counter < items.length; counter++) {
                            if (items[counter].isEmpty()) {
                                items[counter] = itemAdded;
                                totalAmountOfItems++;
                                System.out.println("Item added");
                                break;
                            }
                        }
                    }
                }
            }
            else if (command.equalsIgnoreCase("view")) {
                for (int counter = 0; counter < items.length; counter++) {
                    if (!items[counter].isEmpty()) {
                        System.out.print(items[counter] + " ");
                    }
                }
                System.out.println();
            }
            else if (command.equalsIgnoreCase("search")) {
                System.out.println("What item do you want to search?");
                String searchItem = scanner.nextLine();
                boolean foundItem = false;
                for (int counter = 0; counter < items.length; counter++) {
                    if (items[counter].equalsIgnoreCase(searchItem)) {
                        System.out.println("Item located at index: " + counter);
                        foundItem = true;
                    }
                }
                if (!foundItem) {
                    System.out.println("There is no such item in the list");
                }
            }
            else if (command.equalsIgnoreCase("remove")) {
                if (totalAmountOfItems == 0) {
                    System.out.println("Array is empty. There is nothing to remove.");
                } else {
                    System.out.println("What item you want to remove");
                    String itemRemoved = scanner.nextLine();

                    for (int counter = 0; counter < items.length; counter++) {
                        if (items[counter].equalsIgnoreCase(itemRemoved)) {
                            items[counter] = "";
                            totalAmountOfItems--;
                            System.out.println("Item removed.");
                            break;
                        }
                    }

                }
            }

        }

    }
}


