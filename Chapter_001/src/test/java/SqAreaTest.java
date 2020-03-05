package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;
public class SqAreaTest {
    @Test
    public void square() {
        double expected = 4.6875;
        double out = SqArea.square(10, 3);
        Assert.assertEquals(expected, out, 0.01);
    }
}
