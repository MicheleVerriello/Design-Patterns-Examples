package strategyPattern.ducks;

import strategyPattern.behaviours.fly.FlyBehaviour;
import strategyPattern.behaviours.quack.QuackBehaviour;

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

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        flyBehaviour = fb;
    }
}
