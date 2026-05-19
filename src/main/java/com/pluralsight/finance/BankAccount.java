package com.pluralsight.finance;

public class BankAccount implements iValuable {
    private int accountNumber;
    private String owner;
    private double balance;

    public BankAccount(int accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    /// Deposit is positive
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /// Withdraw is negative
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    /// Returns the overall balance
    @Override
    public double getValue() {
        return balance;
    }
}
