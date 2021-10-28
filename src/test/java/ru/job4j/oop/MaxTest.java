package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void when5to4to3to2then5() {
        int a = 5;
        int b = 4;
        int c = 3;
        int d = 2;
        int result = Max.max(a, b, c, d);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void when1to4to3to2then4() {
        int a = 1;
        int b = 4;
        int c = 3;
        int d = 2;
        int result = Max.max(a, b, c, d);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void when0to2to3to1then3() {
        int a = 0;
        int b = 2;
        int c = 3;
        int d = 1;
        int result = Max.max(a, b, c, d);
        Assert.assertEquals(result, 3);
    }

    @Test
    public void when0to4to3to5then5() {
        int a = 0;
        int b = 4;
        int c = 3;
        int d = 5;
        int result = Max.max(a, b, c, d);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void when0to4to3then4() {
        int a = 0;
        int b = 4;
        int c = 3;
        int result = Max.max(a, b, c);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void when0to4then4() {
        int a = 9;
        int b = 4;
        int result = Max.max(a, b);
        Assert.assertEquals(result, 9);
    }
}