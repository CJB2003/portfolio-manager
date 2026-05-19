package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123, "Pam", 12500);
        iValuable account2 = new BankAccount(456, "Gary", 1500);

        Portfolio port = new Portfolio("Chris", "BNY");

        // try to deposit money into both accounts
        account1.deposit(100);

        port.addAssets(new BankAccount(548, "Chris", 54200));
        port.addAssets(new Jewelry("Diamond", 18));
        port.addAssets(new Gold("James", 3000, 5.32));
        port.addAssets(new House("Ant", 100043, 2023, 2000, 3));
        port.addAssets(new CreditCard("543-435-5054", 3405));

        System.out.println("Total assets value: " + port.getValue());
        System.out.println("Most valuable asset value: " + port.getMostValuable().getValue());
        System.out.println("Least valuable asset value: " + port.getLeastValuable().getValue());
    }
}
