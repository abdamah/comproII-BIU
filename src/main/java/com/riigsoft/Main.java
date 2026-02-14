package com.riigsoft;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// Create User object
        User user = new User();
        //access members of class

        // accessing variables
        user.userName = "abdallah";
        user.password = "123@@";

        //accessing methods
        user.profile();

        // Creating Rectangle class object
        Rectangle rec = new Rectangle();
        // variables
        rec.w = 10;
        rec.h= 2;
        //method
        rec.area();
    }
}