package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    GetMaximum getMaximum;

    @Test
    public void givenIntegers_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum();
        int maxInteger = getMaximum.findMaxIntegerValue(6, 4, 2);
        Assert.assertEquals(6, maxInteger);
    }

    @Test
    public void givenIntegers_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum();
        int maxInteger = getMaximum.findMaxIntegerValue(2, 6, 4);
        Assert.assertEquals(6, maxInteger);
    }

    @Test
    public void givenIntegers_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum();
        int maxInteger = getMaximum.findMaxIntegerValue(2, 4, 6);
        Assert.assertEquals(6, maxInteger);
    }

    @Test
    public void givenFloats_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum();
        Float maxFloatValue = getMaximum.findMaxFloatValue(5.1f,3.1f,1.1f);
        Assert.assertEquals((Float)5.1f, maxFloatValue);
    }

    @Test
    public void givenFloats_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum();
        Float maxFloatValue = getMaximum.findMaxFloatValue(3.1f,5.1f,2.1f);
        Assert.assertEquals((Float)5.1f, maxFloatValue);
    }
    @Test
    public void givenFloats_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum();
        Float maxFloatValue = getMaximum.findMaxFloatValue(2.1f,3.1f,5.1f);
        Assert.assertEquals((Float)5.1f, maxFloatValue);
    }

    @Test
    public void givenStrings_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum();
        String maxString = getMaximum.findMaxStringValue("Orange","Apple","Banana");
        Assert.assertEquals("Orange", maxString);
    }
    @Test
    public void givenStrings_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum();
        String maxString = getMaximum.findMaxStringValue("Apple","Orange","Banana");
        Assert.assertEquals("Orange", maxString);
    }
    @Test
    public void givenStrings_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum();
        String maxString = getMaximum.findMaxStringValue("Apple","Banana","Orange");
        Assert.assertEquals("Orange", maxString);
    }
}
