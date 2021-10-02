package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void testCalculator()
    {
        Solution28 solution = new Solution28();

        int expected = 12;
        int numberArray[] = new int[]{1, 1, 0, 3, 7};
        int actual = solution.calculator(numberArray);
        assertEquals(expected, actual);
        //int actual
    }





}
