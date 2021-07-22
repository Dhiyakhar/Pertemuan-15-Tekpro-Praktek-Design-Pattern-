package StrategyPattern.Fly;

public class FlyWithWings implements IFlyBehaviour {
    @Override
    public void fly() {
    	System.out.println ( "I'm flying!");
    }
}
