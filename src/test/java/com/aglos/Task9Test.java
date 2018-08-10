package com.aglos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task9Test {

    @Test
    public void standartTestForMaxTasks() {
        int n = 5;
        int[] low = {1, 5, 4, 5, 3};
        int[] high = {3, 6, 8, 7, 6};
        assertEquals(20, Task9.maxTasks(high, low, n));
    }

    @Test(expected = NegativeArraySizeException.class)
    public void negativeArraySizeTestForMaxTasks() {
        int n = -5;
        int[] low = {1, -5, 4, 5, 3};
        int[] high = {3, 6, -8, 7, 6};
        assertEquals(20, Task9.maxTasks(high, low, n));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void bigNumbersTestForMaxTasks(){
        int n= 100000;
        int[] low = {123, 54, 432, 543, 323};
        int[] high = {343, 612, 843, 743, 623};
        assertEquals(20, Task9.maxTasks(high, low, n));
    }
}