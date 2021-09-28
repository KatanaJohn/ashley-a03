package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test

    void testCalculateHeartRateArray()
    {
        Solution31 solution = new Solution31();

        int expected = 138;
        int[] actualArr = solution.calculateHeartRateArray(65, 22);
        int actual = actualArr[55];

        assertEquals(expected, actual);
    }

}