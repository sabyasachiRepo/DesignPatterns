package strategydesignpattern;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck modelDuck=new ModelDuck();
        modelDuck.performFLy();
        modelDuck.performQuack();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFLy();


    }

}
