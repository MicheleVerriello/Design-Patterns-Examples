package delegatePattern.ducks;

import delegatePattern.behaviours.fly.FlyWithWings;
import delegatePattern.behaviours.quack.Quack;

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
