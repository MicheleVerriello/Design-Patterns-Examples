package delegatePattern.behaviours.fly;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
