package ru.job4j;

import org.junit.Assert;
import org.junit.Test;

public class ConventerTest {

    @Test
    public void whenConvert140Rbl2Euro() {
        float in = 140;
        float expected = 2;
        float out = Conventer.rubToEuro(in);
        float eps = 0.001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RBL2Dollar() {
        float in = 140;
        float expected = 2.3333f;
        float eps = 0.0001f;
        float out = Conventer.rubToDol(in);
        Assert.assertEquals(expected, out, eps);
    }
}