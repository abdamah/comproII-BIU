package com.riigsoft;

/* Poly-> many : morphism: many
    polymorphism : many forms
    types of polymorphism
    1. Overriding -> parent -> child methods
    2. Overloading -> a method with same name
    but different signature in the same class.
*/
public class Polymorphism {

    // method with 2 integer params
    public void sum(int a, int b){
        System.out.println(a + b);
    }

    // method with 3 integer params (overloaded)
    public void sum (int a, int b, int c){
        System.out.println(a -b);
    }
}
