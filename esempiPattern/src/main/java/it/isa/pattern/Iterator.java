package it.isa.pattern;

interface MyIterator{
    void rewind();
    int nextElement();
    boolean hasNextElement();
}

interface MyCollection{
    public MyIterator getIter();
}

class MyListIterator implements MyIterator{
    private int index= -1;
    private int [] lista;

    public MyListIterator( MyListArray la){
        lista= la.lista;
    }

    public void rewind(){
        index=-1;
    }

    public int nextElement(){
        index++;
        return lista[index];
    }

    public boolean hasNextElement(){
        return index < lista.length-1;
    }
}

class MyListArray implements MyCollection{
    public int[] lista;

    public MyListArray(int n){

    }
}

public class Iterator{
    public static void esegui(){
        System.out.println("Iterator pattern");
        MyCollection la =new MyListArray(n: 10);
        MyIterator li =la.getIter();

        while(li.hasNextElement()){
            System.out.println("Elementi: "+ li.nextElement());
        }
    }
}