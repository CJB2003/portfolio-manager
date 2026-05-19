package com.pluralsight.finance;

public class CreditCard implements iValuable {
    private String name;
    private String cardNumber;
    private double balance;

    public CreditCard(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void charge(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void pay(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    /// Since it's a credit card, amount is always gonna be negative
    @Override
    public double getValue() {
        return -balance;
    }
}