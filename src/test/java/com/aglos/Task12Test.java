package com.aglos;

import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Assert;
import org.junit.Test;

public class Task12Test {
    @Test
    public void standartTest()

    {
        Assert.assertEquals(1, Task12.waysOfTailing(2, 3));
    }

    @Test
    public void standartIn() {
        Assert.assertEquals(2, Task12.waysOfTailing(4, 4));
    }

    @Test(expected = ClassCastException.class)
    public void ClassCastExceptionTest() {
        Assert.assertEquals("0",Task12.waysOfTailing(0,0));
    }
}
