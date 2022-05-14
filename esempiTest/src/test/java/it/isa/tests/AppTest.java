package it.isa.tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import org.junit.jupiter.api.Timeout;


@TestInstance(Lifecycle.PER_CLASS)
public class AppTest 
{
    @BeforeAll
    public void execBeforeAll(){
        System.out.println("Before All");
    }
    @BeforeEach
    public void execBeforeEach(){
        System.out.println("Before Each");
    }
    @Test
    public void shouldAnswerWithFalse(){
        System.out.println("Metodo shouldAnswerWithFalse");
        assertFalse( false );
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        System.out.println("Metodo shouldAnswerWithTrue");
        assertTrue( true );
    }

    @Disabled
    @Test
    @Timeout(value = 1,unit = TimeUnit.SECONDS)
    public void sleepForSomeTime(){
        System.out.println("Sleeping...");
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch(Exception e){

        }
    }
}
