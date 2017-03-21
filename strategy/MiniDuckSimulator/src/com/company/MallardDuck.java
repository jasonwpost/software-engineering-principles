package com.company;

/**
 * Created by Jason on 21/03/17.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();

    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck");
    }
}
