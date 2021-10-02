package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void testFilter() {
        Solution38 solution = new Solution38();
        int[] actualArray = {1, 2, 3, 4, 5};
        actualArray = solution.filterEvenNumbers(actualArray);
        int expected = 2;
        assertEquals(expected, actualArray[0]);

        expected = 4;
        assertEquals(expected, actualArray[1]);

    }

}