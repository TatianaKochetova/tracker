package ru.job4j.calculator;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.converter.Converter;

public class FitTest {
    @Test
    public void manWeight() {
        double expected = 92;
        double out = Fit.manWeight(180);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void womanWeight() {
        double expected = 71.3;
        double out = Fit.womanWeight(172);
        Assert.assertEquals(expected, out, 0.01);
    }
}
