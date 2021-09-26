package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution25Test {
    @Test
    void testPasswordCheck()
    {
        Solution25 solution = new Solution25();

        assertEquals(0, solution.passwordStrengthIndicator("5$"));
        assertEquals(1, solution.passwordStrengthIndicator("4444"));
        assertEquals(2, solution.passwordStrengthIndicator("aaaa"));
        assertEquals(3, solution.passwordStrengthIndicator("1a2b3c4d"));
        assertEquals(4, solution.passwordStrengthIndicator("480a550b$"));

    }
}