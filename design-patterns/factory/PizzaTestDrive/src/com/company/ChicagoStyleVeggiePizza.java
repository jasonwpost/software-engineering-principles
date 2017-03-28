package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza(){
        name = "Chicago Style Sauce and Vege Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Assorted Vegetables");
    }

    @Override
    void cut(){
        System.out.println("Cutting pizza into square slices");
    }
}
