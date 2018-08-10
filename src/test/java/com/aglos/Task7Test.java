package com.aglos;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class Task7Test {
    @Test
    public void countWays() {
        Task7 task7 = new Task7();
        assertEquals(4, task7.countWays(3));
        assertEquals(24, task7.countWays(6));
    }
}
