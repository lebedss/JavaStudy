package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when12to34then2point8() {
        double expected = 2.8284271247461903;
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to24then3point6() {
        double expected = 3.605551275463989;
        int x1 = 0;
        int y1 = 1;
        int x2 = 2;
        int y2 = 4;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when82to30then5point4() {
        double expected = 5.385164807134504;
        int x1 = 8;
        int y1 = 2;
        int x2 = 3;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}