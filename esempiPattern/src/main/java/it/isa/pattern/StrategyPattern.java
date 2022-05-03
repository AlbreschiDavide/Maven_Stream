package it.isa.pattern;

interface Strategy{
    doOp();
}
class ConvertLowercase implements Strategy{
    public String doOp(String s){
        return s.toLowerCase();
    }
}

class ConvertUppercase implements Strategy{
    public String doOp(String s){
        return s.toUpperCase();
    }
}
class Capitalize implements Strategy{
    public String doOp(String s){
        return s.substring(0,1).toUpperCase()+ s.substring();
    }
}
class Context{
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public String doOp(String s){
        return strategy.doOp(s);
    }
}    

//client
public class StrategyPattern {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern");
    }
}