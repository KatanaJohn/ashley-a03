package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution33Test {

    @Test
    void testMagic8Ball()
    {
        Solution33 solution = new Solution33();

        String[] magicBall  = new String[5];
        magicBall[0] = "Yes";
        magicBall[1] = "No";
        magicBall[2] = "Maybe";
        magicBall[3] = "Ask again later.";

        String expected = "Yes";
        String actual = solution.generateResponse(magicBall, 0);
        assertEquals(expected, actual);

    }

}