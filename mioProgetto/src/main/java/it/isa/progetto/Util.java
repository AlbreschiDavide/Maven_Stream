package it.isa.progetto;

public class Util {
    private int a;
    
    public static void stampa() {
        System.out.println("stampato nella classe");
    }
    
    public Util() {
        a = 0;
    }
    public void update() {
        a = 3;
    }
    public void printValore() {
        System.out.println(a);
    }
}
