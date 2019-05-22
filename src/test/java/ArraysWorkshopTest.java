import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArraysWorkshopTest {
    private ArraysWorkshop arraysWorkshop = new ArraysWorkshop();

    @Test
    public void reverseArrayWithOddElements() {
        int[] actual = new int[]{5, 4, 3, 2, 1};
        int[] expected = new int[]{1, 2, 3, 4, 5};

        assertThat(arraysWorkshop.reverse(actual), is(expected));
    }

    @Test
    public void reverseArrayWithEvenElements() {
        int[] actual = new int[]{5, 4, 3, 2};
        int[] expected = new int[]{2, 3, 4, 5};

        assertThat(arraysWorkshop.reverse(actual), is(expected));
    }

    @Test
    public void sortArray() {
        int[] actual = new int[]{2, 3, 4, 1, 5, 1};
        int[] expected = new int[]{1, 1, 2, 3, 4, 5};

        assertThat(arraysWorkshop.sort(actual), is(expected));
    }

    @Test
    public void mergeArrays() {
        int[] first = new int[]{2, 3, 4, 1, 5, 1};
        int[] second = new int[]{1, 1, 2, 3, 4, 6};
        int[] expected = new int[]{2, 3, 4, 1, 5, 1, 6};

        assertThat(arraysWorkshop.merge(first, second), is(expected));
    }

    @Test
    public void searchValidNumber() {
        int[] actual = new int[]{2, 3, 4, 1, 5, 1};
        assertThat(arraysWorkshop.binarySearch(actual, 3), is(true));
    }

    @Test
    public void searchInvalidNumber() {
        int[] actual = new int[]{2, 3, 4, 1, 5, 1};
        assertThat(arraysWorkshop.binarySearch(actual, 8), is(false));
    }

    @Test
    public void gradingStudents() {
        int[] input = new int[]{73, 67, 38, 33};
        int[] output = new int[]{75, 67, 40, 33};
        assertThat(arraysWorkshop.gradingStudents(input), is(output));
    }

    @Test
    public void lonelyInteger() {
        int[] input = new int[]{0, 0, 1, 2, 1 };
        int output = 2;

        assertThat(arraysWorkshop.lonelyinteger(input), is(output));
    }
}
