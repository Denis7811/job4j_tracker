package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to40then4() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        double dist = a.distance(b);
        Assert.assertEquals(dist, 4, 0.01);
    }

    @Test
    public void when02to00then2() {
        Point a = new Point(0, 2);
        Point b = new Point(0, 0);
        double dist = a.distance(b);
        Assert.assertEquals(dist, 2, 0.01);
    }

    @Test
    public void when49to15hen5() {
        Point a = new Point(4, 9);
        Point b = new Point(1, 5);
        double dist = a.distance(b);
        Assert.assertEquals(dist, 5, 0.01);
    }

    @Test
    public void when001to000hen1() {
        Point a = new Point(0,0,1);
        Point b = new Point(0,0,0);
        double dist3D = a.distance3D(b);
        Assert.assertEquals(dist3D, 1, 0.01);
    }

    @Test
    public void when000to000hen0() {
        Point a = new Point(0,0,0);
        Point b = new Point(0,0,0);
        double dist3D = a.distance3D(b);
        Assert.assertEquals(dist3D, 0, 0.01);
    }

    @Test
    public void when034to000hen5() {
        Point a = new Point(0,3,4);
        Point b = new Point(0,0,0);
        double dist3D = a.distance3D(b);
        Assert.assertEquals(dist3D, 5, 0.01);
    }
}