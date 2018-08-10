package com.aglos;

import org.junit.Test;

import static org.junit.Assert.*;

public class Task4Test {

    @Test
    public void testForChecking() {
        int arr[] = {3, 4, 7, 8, 9};
        assertEquals(3, Task4.runTaskFour(arr));
    }
}