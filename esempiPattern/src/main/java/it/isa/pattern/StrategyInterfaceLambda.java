package it.isa.pattern;


interface StrategyIntLamda{
    public String doOp(String s);
}
public class StrategyInterfaceLambda{
    public static void esegui() {
        System.out.println("Strategy pattern con lamda");
        String s= "pRoVa";

        StrategyIntLamda siLowerLamda = stringa -> stringa.toLowerCase();
        System.out.println(siLowerLamda.doOp(s));
    }
}

        