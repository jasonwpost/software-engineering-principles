package com.company;

/**
 * Created by Jason on 23/03/17.
 */
abstract public class Beverage {
    String description = "Unknown beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
