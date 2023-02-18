package strategyPattern.ducks;

import strategyPattern.behaviours.fly.FlyNoWay;
import strategyPattern.behaviours.quack.Quack;

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
