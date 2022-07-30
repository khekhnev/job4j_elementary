package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void theP6K4square1dot25() {
        int p = 6;
        int k = 5;
        double expected = 1.25;
        double out = SqArea.square(6, 5);
        Assert.assertEquals(expected, out, 0.01);
    }

    public void theP106K7square1() {
        int p = 10;
        int k = 7;
        double expected = 2.73;
        double out = SqArea.square(10, 7);
        Assert.assertEquals(expected, out, 0.01);
    }
}