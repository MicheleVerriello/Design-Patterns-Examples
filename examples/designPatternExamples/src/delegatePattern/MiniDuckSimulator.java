package delegatePattern;

import delegatePattern.ducks.Duck;
import delegatePattern.ducks.MallardDuck;

public class MiniDuckSimulator {
    public static void main(String... args){
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
