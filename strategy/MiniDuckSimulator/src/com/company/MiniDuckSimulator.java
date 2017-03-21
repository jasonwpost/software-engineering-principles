package com.company;

public class MiniDuckSimulator {

    public static void main(String[] args) {

		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.performFly();
		model.display();
		model.setFlyBehaviour(new FlyRocketPowered());
		model.performFly();

    }
}
