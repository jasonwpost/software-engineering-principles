package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Assorted Vegetables");
    }

    @Override
    void cut(){
        System.out.print("Cutting pizza into square slices");
    }
}
