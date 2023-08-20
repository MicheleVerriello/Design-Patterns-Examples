package main.java.patterns.strategy.behaviours.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}