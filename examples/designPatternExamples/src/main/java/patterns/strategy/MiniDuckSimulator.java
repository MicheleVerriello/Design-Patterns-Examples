package main.java.patterns.strategy;

import main.java.patterns.strategy.behaviours.fly.FlyRocketPowered;
import main.java.patterns.strategy.ducks.Duck;
import main.java.patterns.strategy.ducks.MallardDuck;
import main.java.patterns.strategy.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String... args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
