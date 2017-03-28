package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza(){
        name = "Chicago Style Sauce and Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Clams");
    }

    @Override
    void cut(){
        System.out.println("Cutting pizza into square slices");
    }
}
