package com.company;

/**
 * Created by Jason on 23/03/17.
 */
public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast coffee";
    }

    @Override
    public double cost() {
        return .99;
    }
}
