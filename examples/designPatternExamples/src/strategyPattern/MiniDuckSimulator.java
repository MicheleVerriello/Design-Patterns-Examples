package strategyPattern;

import strategyPattern.behaviours.fly.FlyRocketPowered;
import strategyPattern.ducks.Duck;
import strategyPattern.ducks.MallardDuck;
import strategyPattern.ducks.ModelDuck;

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
