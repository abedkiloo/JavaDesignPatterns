package com.abedkiloo;

public class Account {
    private double balance;

    public void deposit(float amount) {
        this.balance += amount;
    }

    public void withdraw(float amount) {
        this.balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
