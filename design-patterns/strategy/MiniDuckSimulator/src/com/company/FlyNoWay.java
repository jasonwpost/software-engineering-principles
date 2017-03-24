package com.company;

/**
 * Created by Jason on 21/03/17.
 */
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
