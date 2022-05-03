package it.isa.pattern;


interface StrategyIntLamda{
    public String doOp(String s);
}
public class StrategyInterfaceLambda{
    public static StrategyIntLamda Convert(){
        return s -> s.toUpperCase(); 
    }
    
    public static void esegui() {
        System.out.println("Strategy pattern con lamda");
        String s= "pRoVa";

        StrategyIntLamda siLowerLamda = stringa -> stringa.toLowerCase();
        System.out.println(siLowerLamda.doOp(s));
        
        StrategyIntLamda siUpperLamda=Convert();
        siUpperLamda.doOp(s);
    }
}

        