package designpattern;

public class MainClass {
    public static void main(String[] args) {
        IDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        System.out.println("Quack....");

        ITurkey turkey = new RoyalPalmTurkey();
        turkey.gobble();
        System.out.println("Gobble...");
        turkey.fly();

        IDuck duck = new TurkeyAdapter(turkey);
        duck.quack();
        System.out.println("Quack...");
        duck.fly();
    }
}
