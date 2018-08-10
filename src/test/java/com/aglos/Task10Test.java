package com.aglos;

import com.aglos.Task10;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Task10Test {
    Task task = new Task10();

    @Test(timeout = 1000)
    public void standartTest() {
        Assert.assertEquals("5", Task10.getPolindromeSequense("banana"));
    }

    @Test(expected = NullPointerException.class)
    public void NullPointerTest(){
        Assert.assertEquals("String is empty or has not been initialized",Task10.getPolindromeSequense(""));
    }


}
