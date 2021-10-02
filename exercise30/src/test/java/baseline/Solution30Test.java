package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution30Test {


    @Test
    void testMath()
    {
        Solution30 solution = new Solution30();

        int expected = 132;
        int a = 11;
        int b = 12;
        int actual = solution.doMath(a, b);
        assertEquals(expected, actual);
    }

}