package com.company;

/**
 * Created by Jason on 23/03/17.
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
