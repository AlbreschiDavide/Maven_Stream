package it.isa.pattern;


interface StrategyInterface{
    public String doOp(String s);
}
public class StrategyInterfaceA{
    public static void esegui() {
        System.out.println("Strategy pattern class anonime");
        
        String s= "pRoVa";

        StrategyInterface siLower = new StrategyInterface() {
            public String doOp(String s){
                return s.toLowerCase();
            }    
        
        };
        System.out.println(siLower.doOp(s));
    }
}