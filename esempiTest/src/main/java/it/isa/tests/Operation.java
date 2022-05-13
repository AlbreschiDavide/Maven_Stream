package it.isa.tests;

public class Operation {
    private ServerInterface si;
    private int operationsCounter;
    public Operation(){
        operationsCounter=0;
    }
    public Operation(int operationsCounter){
        this.operationsCounter=operationsCounter;
    }
    public float Operation(ServerInterface si){
        this.si=si;
    }
    public float su(float a, float b){
        operationsCounter++;
        return a+b;
    }
    
}
