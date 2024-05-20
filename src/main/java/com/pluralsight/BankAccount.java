package com.pluralsight;

public class BankAccount implements  Valuable {

    String name; String accountNum; double balance;

    public BankAccount(String name, String accountNum, double balance) {
        this.name = name;
        this.accountNum = accountNum;
        this.balance = balance;
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {


    }

    @Override
    public double getValue() {
        return 0;
    }
}
