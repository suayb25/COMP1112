package com.company;

import java.util.Date;

public class Account {
    //We can not add setter for Account class because user needs to use deposit method to increase their money.
    private int accountId = 1000; //It will be unique. Simple way is increasing the id when the new user created. So, we need a count.
    private double balance;
    private Date dateCreated; //We need to create the date.
    private static int count;
    //It is a variable which belongs to the class and not to object(instance).
    //Static keyword can be used with class.
    //Static members belong to the class instead of a specific instance, this means if you make a member static, you can access it without object.

    public Account(double balance) {
        this.balance = balance;
        this.dateCreated = new Date();
        this.accountId = this.count + this.accountId;
        this.count++;
    }

    public Account() { //We can create an account without taking balance. We will set balance to 0.
        this.balance = 0;
        this.dateCreated = new Date();
        this.accountId = this.count + this.accountId;
        this.count++;
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public void withdraw(double money) {
        if (this.balance >= money) {
            this.balance -= money;
        } else {
            System.out.println("Your balance is not enough for this amount");
        }
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() { //Look here java didn't create a printing option for count.
        return "Account{" +
                "accountId=" + accountId +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                '}';
    }
}