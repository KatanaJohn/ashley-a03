package baseline;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution27Test {

    @Test
    void TestValidation()
    {
        Solution27 solution = new Solution27();

        String firstName = "John";
        String lastName = "Johnson";
        String zip = "55555";
        String ID = "AK-4321";

        int expected = 1;
        int actual = solution.validateInput(firstName, lastName, zip, ID);
        assertEquals(expected, actual);
    }

}