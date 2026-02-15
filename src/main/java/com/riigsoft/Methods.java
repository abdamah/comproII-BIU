package com.riigsoft;

public class Methods {

    private  double balance = 500;
    /*
    * Methods are doing specific task
    * Can be divided according to return statement into
    *  1. return something
    *  2. return nothing
    * */

    // return nothing
    void deposit(){
        System.out.println("Deposit some amount");
    }

    // return something
    double withdraw(){
        System.out.println("Draw some amount");
        return 3.5;
    }


    /**
     * Methods can be divided according params
     * What is parameter?
     *      it is local variable that can be declared inside
     *      method parentheses (it is local variable) scope     *
     *      1. methods with params
     *      2. methods without params
     * */

    // without params
    void getBalance(){
        System.out.println("Your balance: " + balance);
    }

    // methods with param
    void deposit2(double amount){
        balance+= amount;
    }

    // with params

    double withdraw2(double amount){
        balance-=amount;
        return balance;
    }

    /**
     * Methods can be divided according to calling
     *  1. instance methods
     *  2. static/class level methods
     * */

    // all above are instance methods

    // class level methods are defined with 'static' keyword
   // can be called with class name to need to object/instance
    static void test(){
        System.out.println("Static/Class level method");
    }

    public static void main(String[] args) {
        // create Methods object
        Methods m = new Methods();
        // calling methods
        m.deposit();

        // return method should be print result
       double result = m.withdraw();
        System.out.println("result: " + result);

        // params(deposit2)
        m.deposit2(100);
        m.getBalance();

        // params(withdraw2)
        m.withdraw2(200);
        m.getBalance();

        // call class method
        Methods.test();

    }
}
