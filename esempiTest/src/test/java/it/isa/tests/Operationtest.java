package Maven.esempiTest.src.test.java.it.isa.tests;

import java.beans.Transient;
import org.junit.jupiter.api.Test;

public class Operationtest {
    @Test
    public void testSum(){
        Operation op =new Operation();
        float result= op.sum(a:2,b:3);
        assertEquals(expected:5,result);
    }
    @Test
    public void testGotCount(){
        Operation op= new Operation();
        op.sum(1,2);
        assertEquals(1,op.getCount());
    }
}
