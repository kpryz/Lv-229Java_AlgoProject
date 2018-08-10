package com.aglos;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

public class Task5Test {
    @Test
    public void countWays() {
        Task5 task5 = new Task5();
        assertEquals(6, task5.countWays(6));
        assertEquals(8, task5.countWays(8));
    }
}
