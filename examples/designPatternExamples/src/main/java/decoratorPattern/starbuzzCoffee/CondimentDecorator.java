package main.java.decoratorPattern.starbuzzCoffee;

public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;

    public abstract String getDescription();
}
