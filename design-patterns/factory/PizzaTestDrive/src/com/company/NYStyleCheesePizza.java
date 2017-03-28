package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    void cut(){
        System.out.print("Cutting pizza into square slices");
    }
}
