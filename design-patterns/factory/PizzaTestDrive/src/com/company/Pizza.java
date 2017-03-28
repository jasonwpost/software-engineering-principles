package com.company;

import java.util.ArrayList;

/**
 * Created by Jason on 28/03/17.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare(){
        System.out.println("Preparing" + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings: ");
        for (int i = 0; i < toppings.size(); i++){
            System.out.println("    " + toppings.get(i));
        }
    }

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
}
