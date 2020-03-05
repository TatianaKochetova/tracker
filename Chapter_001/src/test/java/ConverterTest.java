package ru.job4j.converter;
import org.junit.Assert;
import org.junit.Test;
public class ConverterTest {
    @Test
    public void rubleToEuro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void rubleToDollar() {
        int in1 = 180;
        int expected1 = 3;
        int out1 = Converter.rubleToDollar(in1);
        Assert.assertEquals(expected1, out1);
    }
}
