package it.isa.tests;

import it.isa.tests.Operation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    public void testSum(){
        Operation op =new Operation();
        float result =op.sum(2,  3);
        assertEquals(5,result);
        //asssertEquals(5,op.sum(2, 3))
    }

    @Test
    public void testGetCount(){
        Operation op =new Operation()
        op.sum(1,2);
        assertEquals(1, op.getCount());
    }
}
