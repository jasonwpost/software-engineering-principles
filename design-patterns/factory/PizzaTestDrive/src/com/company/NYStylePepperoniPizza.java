package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class NYStylePepperoniPizza extends Pizza {

    public NYStylePepperoniPizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Pepperonis");
    }

    @Override
    void cut(){
        System.out.print("Cutting pizza into square slices");
    }
}
