package StrategyPattern.Quack;

public class Squeek implements IQuackBehaviour {
    @Override
    public void quack() {
		 System.out.println ( "Squeak!");
    }
}
