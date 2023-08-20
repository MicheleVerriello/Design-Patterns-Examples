package main.java.patterns.strategy.ducks;

import main.java.patterns.strategy.behaviours.fly.FlyBehaviour;
import main.java.patterns.strategy.behaviours.quack.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour; //composition
    FlyBehaviour flyBehaviour; //composition

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

    public void setQuackBehaviour(QuackBehaviour qb) { //change quack behaviour at runtime
        quackBehaviour = qb;
    }

    public void setFlyBehaviour(FlyBehaviour fb) { //change fly behaviour at runtime
        flyBehaviour = fb;
    }
}
