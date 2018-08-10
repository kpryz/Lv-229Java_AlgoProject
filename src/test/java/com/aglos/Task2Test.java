package com.aglos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task2Test {

    @Test
    public void modFibonacci() {
        int n = (int)Task2.modFibonacci(3);
        assertEquals(1.0, Task2.modFibonacci(3),0.001);

        assertEquals(4.0, Task2.modFibonacci(6),0.001);
        }
}