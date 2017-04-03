package com.company;

import java.util.ArrayList;

/**
 * Created by Jason on 28/03/17.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    ArrayList toppings = new ArrayList();

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes at 350F/180C");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in office PizzaStore box");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) { this.name = name;}
}
