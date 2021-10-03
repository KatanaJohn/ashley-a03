package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution32Test {

    Solution32 solution = new Solution32();

    @Test
    void playAgainTest()
    {
        boolean expected = true;
        String userPlayAgain = "y";
        boolean actual = solution.checkPlayAgain(userPlayAgain);
        assertEquals(expected, actual);

    }

    @Test
    void getMaxTest()
    {
        int expected = 1000;
        int actual = solution.getMaxPossibleValue(3);
        assertEquals(expected, actual);
    }

}