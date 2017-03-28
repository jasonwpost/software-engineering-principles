package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class ChicagoStylePepperoniPizza extends Pizza {

    public ChicagoStylePepperoniPizza(){
        name = "Chicago Style Sauce and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Pepperonis");
    }

    @Override
    void cut(){
        System.out.println("Cutting pizza into square slices");
    }
}
