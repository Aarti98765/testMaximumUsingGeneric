package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    GetMaximum getMaximum;

    @Test
    public void givenIntegers_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum(6, 4, 2);
        Integer max = (Integer) getMaximum.checkMaximum();
        Assert.assertEquals((Integer)6, max);
    }

    @Test
    public void givenIntegers_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum(2, 6, 4);
        Integer max = (Integer) getMaximum.checkMaximum();
        Assert.assertEquals((Integer)6, max);
    }

    @Test
    public void givenIntegers_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum(2,4, 6);
        Integer max = (Integer) getMaximum.checkMaximum();
        Assert.assertEquals((Integer) 6, max);
    }

    @Test
    public void givenFloats_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum(5.1f,3.1f,1.1f);
        Float max = (Float) getMaximum.checkMaximum();
        Assert.assertEquals((Float)5.1f, max);
    }

    @Test
    public void givenFloats_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum(3.1f,5.1f,2.1f);
        Float max = (Float)getMaximum.checkMaximum();
        Assert.assertEquals((Float)5.1f, max);
    }

    @Test
    public void givenFloats_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum(2.1f,3.1f,5.1f);
        Float max = (Float) getMaximum.checkMaximum();
        Assert.assertEquals((Float)5.1f, max);
    }

    @Test
    public void givenStrings_whenMaxIsFirst_returnMaximum() {
        getMaximum = new GetMaximum("Orange","Apple","Banana");
        String max = (String) getMaximum.checkMaximum();
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void givenStrings_whenMaxIsSecond_returnMaximum() {
        getMaximum = new GetMaximum("Apple", "Orange","Banana");
        String max = (String) getMaximum.checkMaximum();
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void givenStrings_whenMaxIsThird_returnMaximum() {
        getMaximum = new GetMaximum("Apple","Banana","Orange");
        String max = (String) getMaximum.checkMaximum();
        Assert.assertEquals("Orange", max);
    }
}
