package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution29Test {

    @Test
    void calculatorValidation() {
        Solution29 solution = new Solution29();
        int rate = 4;

        int expected = 18;
        int actual = solution.calculateInvestment(rate);

        assertEquals(expected, actual);


    }
}