package main.java.strategyPattern;

import main.java.strategyPattern.behaviours.fly.FlyRocketPowered;
import main.java.strategyPattern.ducks.Duck;
import main.java.strategyPattern.ducks.MallardDuck;
import main.java.strategyPattern.ducks.ModelDuck;

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
