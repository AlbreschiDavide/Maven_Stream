package it.isa.pattern;

interface NewEngine{
    public void run();
}

class NewCar implements NewEngine{
    public void run(){
        System.out.println("The car is running");
    }
}

class NewRocket implements NewEngine{
    public void run(){
        System.out.println("The rocket is running");
    }
}

abstract class EngineDecorator implements NewEngine{
    protected NewEngine decoratedEngine;

    public EngineDecorator(NewEngine decoratedEngine){
        this.decoratedEngine=decoratedEngine;
    }

    public void run(){
        decoratedEngine.run();
    }
}

class BoostedEngineDecorator extends EngineDecorator{
    public BoostedEngineDecorator(NewEngine engine){
        super(engine);
    }
    private void boostIt(){
        System.out.println("Boosted");
    }
    public void run(){
        decoratedEngine.run();
        boostIt();
    }
}
//cient
public class DecoratorPattern{
    public static void main(String[] args) {
        System.out.println("Decoration Pattern");
        NewEngine e =new NewCar();
        e.run();

        NewEngine boostedCar =new BoostedEngineDecorator(new NewCar());
        boostedCar.run();

        NewEngine boostedRocket =new BoostedEngineDecorator(new NewRocket());
        boostedRocket.run();
    }
}
