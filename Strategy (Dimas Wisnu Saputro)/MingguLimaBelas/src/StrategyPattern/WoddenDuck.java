package StrategyPattern;

import StrategyPattern.Fly.FlyNoWay;
import StrategyPattern.Quack.MuteQuack;

public class WoddenDuck extends Duck {
	public WoddenDuck() {
        super.setQuackBehaviour(new MuteQuack());
        super.setFlyBehaviour(new FlyNoWay());
    }

	@Override
    public void display() {
		System.out.println("I'm a Wodden Duck");
    }
}

