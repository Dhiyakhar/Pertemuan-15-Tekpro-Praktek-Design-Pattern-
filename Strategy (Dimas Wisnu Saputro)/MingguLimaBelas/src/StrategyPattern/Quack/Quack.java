package StrategyPattern.Quack;

public class Quack implements IQuackBehaviour {
    @Override
    public void quack() {
		 System.out.println ( "Quack!");
    }
}
