package com.aglos;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Task9Test {

    @Test
    public void maxTasks() {
        int n = 5;
        int[] low = {1, 5, 4, 5, 3};
        int[] high = {3, 6, 8, 7, 6};
        assertEquals(20, Task9.maxTasks(high, low, n));
    }
}