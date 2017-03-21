package com.company;

/**
 * Created by Jason on 21/03/17.
 */
public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
}
