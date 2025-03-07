package com.nt.main;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {

   
    @Test
    public void sumWithPos() {
        App app=new App();
        int expected=500;
        int actual=app.sum(200, 300);
        assertEquals(expected, actual);
        
    }
    @Test
    public void sumWithNeg() {
        App app=new App();
        int expected=-500;
        int actual=app.sum(-200,-300);
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void sumWithMix() {
        App app=new App();
        int expected=100;
        int actual=app.sum(-200, 300);
        assertEquals(expected, actual);
        
    }
    @Test
    public void zero() {
        App app=new App();
        int expected=0;
        int actual=app.sum(0, 0);
        assertEquals(expected, actual);
        
    }
}
