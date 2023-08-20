package main.java.patterns.strategy.ducks;

import main.java.patterns.strategy.behaviours.fly.FlyNoWay;
import main.java.patterns.strategy.behaviours.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
