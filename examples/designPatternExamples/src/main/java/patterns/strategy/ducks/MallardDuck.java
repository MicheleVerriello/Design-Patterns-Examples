package main.java.patterns.strategy.ducks;

import main.java.patterns.strategy.behaviours.fly.FlyWithWings;
import main.java.patterns.strategy.behaviours.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
