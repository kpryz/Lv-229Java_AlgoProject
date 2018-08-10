package com.aglos;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Task13Test {

    @Test
    public void standartTestForNumWays() {
        int n = 2;
        int k = 4;
        assertEquals(16, Task13.numWays(2, 4));
    }

    @Test
    public void expectBigOutputTestForNumWays() {
        int n = 6;
        int k = 7;
        assertEquals(109116.0, Task13.numWays(n, k), 0.0001);
    }

    @Test(expected = Exception.class)
    public void negativeInputTestForNumWays() {
        Task13.numWays(-2, -5);
    }


}