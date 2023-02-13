package delegatePattern.ducks;

import delegatePattern.behaviours.fly.FlyBehaviour;
import delegatePattern.behaviours.quack.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;

    public Duck(){}

    public abstract void display();

    public void swim() {
        System.out.println("All ducks swim");
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

}
