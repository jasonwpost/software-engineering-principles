package com.company;

/**
 * Created by Jason on 23/03/17.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaffinated coffee";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
