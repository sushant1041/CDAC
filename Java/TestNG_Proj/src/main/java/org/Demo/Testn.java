package org.Demo;

import org.testng.Assert;

public class Testn {
    @org.testng.annotations.Test
    public void testAddition() {
        int a = 5;
        int b = 3;
        int sum = a + b;
        Assert.assertEquals(sum, 8, "Addition result is incorrect!");
    }

    @org.testng.annotations.Test
    public void testSubtraction() {
        int a = 10;
        int b = 4;
        int difference = a - b;
        Assert.assertEquals(difference, 6, "Subtraction result is incorrect!");
    }
}

