package prod;

import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class IntercalateArraysTest {

    @Test
    public void testIntercalateSizeDiff() {
        int[] A = {5, 10, 20, 30, 40, 50};
        int[] B = {6, 3, 8, 2, 0, 60};
        int[] expected = {5, 6, 10, 3, 20, 8, 30, 2, 40, 0, 50, 60};
        assertArrayEquals(expected, IntercalateArrays.intercalateArrays(A, B));
    }

    @Test
    public void testIntercalateArrays() {
        int[] A = {1, 1, 1};
        int[] B = {1, 2, 3};
        int[] expected = {1, 1, 1, 1, 2, 3};
        assertArrayEquals(expected, IntercalateArrays.intercalateArrays(A, B));
    }
}
