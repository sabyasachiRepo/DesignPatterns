package strategydesignpattern;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFLy() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All duck float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour){
        this.flyBehaviour=flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour){
        this.quackBehaviour=quackBehaviour;
    }

}
