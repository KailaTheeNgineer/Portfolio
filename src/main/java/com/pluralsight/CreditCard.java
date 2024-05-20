package com.pluralsight;

public class CreditCard implements  Valuable {

    String name; String accountNum; double balance;


    public CreditCard(String name, String accountNum, double balance) {
    this.name = name;
    this.accountNum = accountNum;
    this.balance = balance;
}

    public void charge(double amount) {

    }

    public void pay(double amount) {


    }

    @Override
    public double getValue() {
        return 0;
    }
}
