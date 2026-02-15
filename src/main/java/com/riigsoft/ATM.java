package com.riigsoft;

public class ATM {

    private double balance;

    // consstructor params
    public ATM(double balance){
        this.balance = balance;
    }

    void getBalance(){
        System.out.println("Your balance: " + balance);
    }

    // void type deposit params
    void deposit(double amount){
//        balance = balance + amount;
         balance += amount; // compound
    }

    // withdraw

    double withdraw(double amount){
        balance -= amount;

        return amount;
    }

    static void info(){
        System.out.println("Static method");
    }

    public static void main(String[] args) {
        ATM abdallah = new ATM(10.0);
        abdallah.getBalance();

        abdallah.deposit(300);
        abdallah.getBalance();

        ATM abc = new ATM(20);
        abc.getBalance();


        double result = abc.withdraw(15);
        System.out.println("Qaatay: "+ result);

        abc.getBalance();


        ATM.info();


    }
}
