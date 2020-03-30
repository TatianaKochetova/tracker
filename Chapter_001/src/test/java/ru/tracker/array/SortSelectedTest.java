package ru.tracker.array;
import array.SortSelected;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
    @Test
    public void whenSort3() {
        int[] input = new int[] { 3, 12, 1};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 3, 12};
        assertThat(result, is(expect));
    }
}
