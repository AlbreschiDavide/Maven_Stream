package it.isa.tests;

import it.isa.tests.ServerInterface;

public class Operation {
    private ServerInterface si; 

    private int operationsCounter;
    
    public Operation(){
        operationsCounter=0;
    }
    public Operation(int operationsCounter){
        this.operationsCounter = operationsCounter;
    }
    public Operation(ServerInterface si){
        this.si = si;
    }
    
    public int getServerStatus(){
        return si.getStatus();
    }

    public String getUrl(String serviceName, String state){
         return si.getUrl(serviceName, state);
    }
    
    public int sumInt(int a,int b){
        operationsCounter++;
        return a+b;
    }
    public float divisione(int a, int b){
        return (float) a/b;
    }

    public int getCount(){
        return operationsCounter;
    }

    public boolean positivi(int a, int b){
        if (a > 0 && b > 0){
            return true;
        }else{
            return false;
        }
        // return ((a > 0) && (b > 0))
    }
}
