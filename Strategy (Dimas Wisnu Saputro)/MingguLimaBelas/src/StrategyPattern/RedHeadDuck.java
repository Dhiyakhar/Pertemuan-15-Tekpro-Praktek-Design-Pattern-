package StrategyPattern;

import StrategyPattern.Fly.FlyWithWings;
import StrategyPattern.Quack.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
        super.setQuackBehaviour(new Quack());
        super.setFlyBehaviour(new FlyWithWings());
    }

	@Override
    public void display() {
		System.out.println("I have a red head");
    }
}

