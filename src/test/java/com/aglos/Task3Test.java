package com.aglos;

import javafx.concurrent.Task;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task3Test {

    @Test
    public void testForChecking() {
        int n = 1;
        assertEquals(1,Task3.runTaskThree(n));
    }
    @Test(expected = Exception.class)
    public void testForOutOfBounds(){
        int n = 100;
        assertEquals(1,Task3.runTaskThree(n));
    }
}