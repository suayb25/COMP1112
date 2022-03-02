/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp1112_week1;

import java.util.Date;

/**
 *
 * @author lab
 */
public class Account {
    private double balance;
    private Date date;

    public Account() {
        date = new Date();
    }
    
    public Account(double money){
        this.balance = money;
        date = new Date();
    }
    
    public double deposit(double money){
        this.balance += money;
        return this.balance;
    }
    
    public double withdraw(double money){
        this.balance -= money;
        return this.balance;
    }
    
}
