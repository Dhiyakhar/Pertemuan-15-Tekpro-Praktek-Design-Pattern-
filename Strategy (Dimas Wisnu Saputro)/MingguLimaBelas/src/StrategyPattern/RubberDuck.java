package StrategyPattern;

import StrategyPattern.Fly.FlyNoWay;

public class RubberDuck extends Duck {
	public RubberDuck() {
        super.setFlyBehaviour(new FlyNoWay());
    }
	
	@Override
    public void display() {
		System.out.println("I made of rubber");
    }
}
