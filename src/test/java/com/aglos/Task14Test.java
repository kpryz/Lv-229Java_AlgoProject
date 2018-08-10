package com.aglos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task14Test {

    @Test
    public void countWays() {
        assertEquals(16.0,Task14.countWays(2,4),0.001);
        assertEquals(7200.0,Task14.countWays(5,6),0.001);

    }
    @Test
    public void expectBigOutputTestForNumWays() {
        int n = 6;
        int k = 7;
        //assertEquals(109116.0, Task14.countWays(n, k), 0.0001);
    }

}