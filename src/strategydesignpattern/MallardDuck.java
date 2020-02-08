package strategydesignpattern;

public class MallardDuck extends Duck{

    @Override
    public void display() {
        System.out.println("I am a real mallard duck");
    }

    public  MallardDuck(){
        flyBehaviour=new FlyWithWings();
        quackBehaviour=new Quack();
    }
}
