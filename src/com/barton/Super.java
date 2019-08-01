package com.barton;

public class Super {
    /**
     * This is an instance variable in the sub class
     */
    String myString;

    /**
     * Here is a default constructor
     */
    Super() {
    }

    //parameterised constructor
    public Super(String myString) {
        this.myString = myString;
    }
    /**
     * The myString is going to be used in other classes
     *
     * Java only supports single inheritance
     */
    public static void main(String[] args) {
        Super sup = new Super();
        System.out.println();
        sup.myString();
    }

    private void myString() {

    }
}
