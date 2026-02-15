package com.riigsoft;

public class IfCondition {
    public static void main(String[] args) {
        int x = 2;


        // even / odd
        if(x % 2 ==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

        // fizzbuzz (1-100)

        int value = 7;
        if (value % 3==0 && value %5==0 )
            System.out.println("FizzBuzz");
       else  if (value % 3 == 0)
            System.out.println("Fizz");

        else if (value %5 == 0)
            System.out.println("Buzz");
        else
            System.out.println(value);

    }
}
