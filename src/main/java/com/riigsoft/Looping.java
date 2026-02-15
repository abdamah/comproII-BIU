package com.riigsoft;

public class Looping {

    public static void main(String[] args) {
        // for loop
        // print first 5 numbers
        System.out.print("for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        //while loop: print first 5 even numbers
        System.out.print("while loop:");
        int i = 2;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 2;
        }

        System.out.println();
        // do-while loop: print first 5 odd numbers
        System.out.print("do-while loop:");
        int k = 1;
        do {
            System.out.print(k + " ");
            k += 2;
        } while (k < 10);
    }
}
