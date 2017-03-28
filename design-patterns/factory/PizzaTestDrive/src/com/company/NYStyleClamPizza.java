package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class NYStyleClamPizza extends Pizza {

    public NYStyleClamPizza(){
        name = "NY Style Sauce and Clam Pizza";
        dough = "Thin Crust";
        sauce = "Marinara Sauce";

        toppings.add("Clams");
    }

    @Override
    void cut(){
        System.out.print("Cutting pizza into square slices");
    }
}
