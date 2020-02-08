package strategydesignpattern;

public class FlyRocketPowered implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I am flaying with a rocket");
    }

}
