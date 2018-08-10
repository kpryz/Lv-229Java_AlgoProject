package com.aglos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {


    @Test
    public void fibonacciTest() {
        assertTrue(Task1.fibonacci(1)==1);
        assertTrue(Task1.fibonacci(2)==2);
        assertTrue(Task1.fibonacci(3)==3);
        assertTrue(Task1.fibonacci(5)==8);

    }






}