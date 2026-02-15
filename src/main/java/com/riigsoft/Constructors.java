package com.riigsoft;

public class Constructors {

    private int value;

    /* Constructor is a special methods that has same name as class
     * It can be divided into
     *  1. default constructor: if we did not create any constructor
     *      every java class has its own
     *     default constructor does not have parameter
     *  2. Parameterized constructor
     *
     * */

    // default constructor
    public Constructors(){

    }

    // parameterized constructor
    public Constructors(int value){
        this.value = value;
    }

    int getValue(){
        return value;
    }


    public static void main(String[] args) {
        Constructors c = new Constructors();// default constructor
        c.value= 10;
        System.out.println(c.getValue());

        // parameterized constructor
        Constructors c2 = new Constructors(100);
        System.out.println(c2.getValue());
    }
}
