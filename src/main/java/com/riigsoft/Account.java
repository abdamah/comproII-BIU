package com.riigsoft;

// Encapsulation class
public class Account {
    private double balance;

    // Setter: to update private variables values
    // always void type method
    public void setBalance(double amount){
        this.balance = this.balance + amount;

        System.out.println("Balance: " +  this.balance );
    }

    // Getter: to read private variable values
    // Always return same private variable value type(Data type)
    public double getBalance(){
        return this.balance;
    }
}
