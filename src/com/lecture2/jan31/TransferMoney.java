package com.lecture2.jan31;

public class TransferMoney {
    private String nameofBank = "name";

    public void transferMoney(String name, int money) {
        System.out.println("Tranfer money start");
        boolean check = check(name);
        if (check) {
            transfer();
        } else {
            reject();
        }
    }
    private void transfer() {
        System.out.println("Tranferring");
    }

    private void reject() {
        System.out.println("Rejecting");
    }

    private boolean check(String name) {
        return name.length() >= 5;
    }
}

class Test {
    public static void main(String[] args) {
        TransferMoney tr = new TransferMoney();
        tr.transferMoney("Vitja", 120);
    }
}
