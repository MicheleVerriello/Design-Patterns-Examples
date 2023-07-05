package main.java.strategyPattern.ducks;

import main.java.strategyPattern.behaviours.fly.FlyNoWay;
import main.java.strategyPattern.behaviours.quack.Quack;

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
