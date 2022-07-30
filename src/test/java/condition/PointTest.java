package condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when01to03then2() {
        int x1 = 0;
        int x2 = 0;
        int y1 = 1;
        int y2 = 3;
        double expected = 2;
        double out = Point.distance(0, 0, 1, 3);
        Assert.assertEquals(expected, out, 1);
    }

    public void when24to01then3dot46() {
        int x1 = 2;
        int x2 = 0;
        int y1 = 4;
        int y2 = 1;
        double expected = 3.46;
        double out = Point.distance(2, 0, 4, 1);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void when53to24then2dot24() {
        int x1 = 5;
        int x2 = 2;
        int y1 = 3;
        int y2 = 4;
        double expected = 2.24;
        double out = Point.distance(5, 2, 3, 4);
        Assert.assertEquals(expected, out, 0.01);
    }
}