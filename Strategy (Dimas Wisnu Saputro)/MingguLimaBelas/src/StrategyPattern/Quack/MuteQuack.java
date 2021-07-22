package StrategyPattern.Quack;

public class MuteQuack implements IQuackBehaviour {
    @Override
    public void quack() {
    	System.out.println("I won't call");
    }
}