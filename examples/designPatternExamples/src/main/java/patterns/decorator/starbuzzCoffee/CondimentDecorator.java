package main.java.patterns.decorator.starbuzzCoffee;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();
}
