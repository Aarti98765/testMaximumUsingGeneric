package com.bridgelabz.generic;

import org.junit.Assert;
import org.junit.Test;

public class TestMaximum {
    GetMaximum getMaximum;

    @Test
    public void givenIntegers_whenMaxIsFirst_returnMaximum() {
        Integer max = (Integer) getMaximum.checkMaximum(6,4,2);
        Assert.assertEquals((Integer)6, max);
    }

    @Test
    public void givenIntegers_whenMaxIsSecond_returnMaximum() {
        Integer max = (Integer) getMaximum.checkMaximum(2,6,4);
        Assert.assertEquals((Integer)6, max);
    }

    @Test
    public void givenIntegers_whenMaxIsThird_returnMaximum() {
        Integer max = (Integer) getMaximum.checkMaximum(2,4,6);
        Assert.assertEquals((Integer) 6, max);
    }

    @Test
    public void givenFloats_whenMaxIsFirst_returnMaximum() {
        Float max = (Float) getMaximum.checkMaximum(5.1f,3.1f,2.1f);
        Assert.assertEquals((Float)5.1f, max);
    }

    @Test
    public void givenFloats_whenMaxIsSecond_returnMaximum() {
        Float max = (Float)getMaximum.checkMaximum(3.1f,5.1f,2.1f);
        Assert.assertEquals((Float)5.1f, max);
    }

    @Test
    public void givenFloats_whenMaxIsThird_returnMaximum() {
        Float max = (Float) getMaximum.checkMaximum(2.1f,3.1f,5.1f);
        Assert.assertEquals((Float)5.1f, max);
    }

    @Test
    public void givenStrings_whenMaxIsFirst_returnMaximum() {
        String max = (String) getMaximum.checkMaximum("Orange","Apple","Banana");
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void givenStrings_whenMaxIsSecond_returnMaximum() {
        String max = (String) getMaximum.checkMaximum("Apple","Orange","Banana");
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void givenStrings_whenMaxIsThird_returnMaximum() {
        String max = (String) getMaximum.checkMaximum("Apple","Banana","Orange");
        Assert.assertEquals("Orange", max);
    }

    @Test
    public void givenIntegers_whenGetMaximum_returnMaximum() {
        getMaximum = new GetMaximum();
        Integer max = (Integer) getMaximum.checkMaximum(3,4,5,6);
        Assert.assertEquals((Integer)6, max);
    }

    @Test
    public void givenFloats_whenGetMaximum_returnMaximum() {
        getMaximum = new GetMaximum();
        Float max = (Float) getMaximum.checkMaximum(3.1f,4.2f,5.1f,6.1f);
        Assert.assertEquals((Float) 6.1f, max);
    }

    @Test
    public void givenString_whenGetMaximum_returnMaximum() {
        getMaximum = new GetMaximum();
        String max = (String) getMaximum.checkMaximum("Apple","Banana","Orange");
        Assert.assertEquals("Orange", max);
    }
}
