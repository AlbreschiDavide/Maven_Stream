package it.isa.tests;

import it.isa.tests.Operation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;
import com.pholser.junit.quickcheck.Property;

import org.junit.runner.RunWith;

@RunWith(JUnitQuickcheck.class)
public class OperationTest {
    
    @Test
    public void testSum(){
        Operation op =new Operation();
        float result =op.sumInt(2,  3);
        assertEquals(5,result);
        //asssertEquals(5,op.sum(2, 3))
    }

    @Test
    public void testGetCount(){
        Operation op =new Operation();
        op.sumInt(1,2);
        assertEquals(1, op.getCount());
    }

    @Test
    public void testserverinterfaceOperation(){
        ServerInterface si= mock(ServerInterface.class);
        Operation op = new Operation(si);

        //quando viene chiamato si.getStatus() restituisci 2
        when(si.getStatus()).thenReturn(2);
        
        assertEquals(2,op.getServerStatus());
        
        verify(si).getStatus();

        when(si.getUrl(anyString(),anyString())).thenReturn("www.unife.it");

        assertEquals("www.unife.it",op.getUrl("esame","italia"));
        assertEquals("www.unife.it",op.getUrl("lezioni","italia"));

        when(si.getUrl(anyString(),eq("italia"))).thenReturn("prova");
    }

    @Property
    public void alwaysHoldSum(int a,int b){
        //fallisce
        Operation op = new Operation();
        int result = op.sumInt(a,b);
        if(a > 0 && b > 0){
            assertTrue(result >= a);
        }   
    }

    @Property
    public void alwaysHoldDivisione(int a,int b){
        //fallisce
        Operation op = new Operation();
        float result = op.divisione(a,b);
        if (a >= 0 && b >= 0 && a > b){
            assertTrue(result > 1);
        }
    }
}
