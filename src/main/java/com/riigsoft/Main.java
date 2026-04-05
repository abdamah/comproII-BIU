package com.riigsoft;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Account ac = new Account();
        ac.setBalance(100);
        System.out.println(ac.getBalance());

    }
}