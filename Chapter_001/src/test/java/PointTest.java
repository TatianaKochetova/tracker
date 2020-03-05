package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Fit;

public class PointTest {
    @Test
    public void distance() {
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void distance1() {
        double expected = 2.23;
        double out = Point.distance(4, 2, 6, 3);
        Assert.assertEquals(expected, out, 0.01);
    }
}
