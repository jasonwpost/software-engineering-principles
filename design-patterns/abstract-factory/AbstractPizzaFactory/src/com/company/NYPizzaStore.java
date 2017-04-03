package com.company;

/**
 * Created by Jason on 28/03/17.
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (item.equals("veggie")){
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("NY Style Veggie Pizza");
        } else if (item.equals("clam")){
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("NY Style Clam Pizza");
        } else if (item.equals("pepperoni")){
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("NY Style Pepperoni Pizza");
        }

        return pizza;
    }

}
