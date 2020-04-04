package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    GetMaximum getMaximum;

    @Test
    public void givenIntegers_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum();
        int maxInteger = getMaximum.findMaxInteger(6, 4, 2);
        Assert.assertEquals(6, maxInteger);
    }

    @Test
    public void givenIntegers_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum();
        int maxInteger = getMaximum.findMaxInteger(2, 6, 4);
        Assert.assertEquals(6, maxInteger);
    }

    @Test
    public void givenIntegers_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum();
        int maxInteger = getMaximum.findMaxInteger(2, 4, 6);
        Assert.assertEquals(6, maxInteger);
    }
}
