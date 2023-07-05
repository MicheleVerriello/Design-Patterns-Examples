package main.java.strategyPattern.ducks;

import main.java.strategyPattern.behaviours.fly.FlyWithWings;
import main.java.strategyPattern.behaviours.quack.Quack;

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
