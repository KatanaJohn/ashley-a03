package baseline;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution39Test {

    private static final String FIRSTNAME = "firstName";
    private static final String LASTNAME = "lastName";
    private static final String POSITION = "position";
    private static final String SEPARATIONDATE = "separationDate";

    @Test
    void testHashMapCreation()
    {
        Solution40 solution = new Solution40();

        HashMap<String, String> expected = new HashMap<>();
        expected.put(FIRSTNAME, "Sally");
        expected.put(LASTNAME, "Webber");
        expected.put(POSITION, "Web Developer");
        expected.put(SEPARATIONDATE, "2015-12-18");

        Map<String, String> actual = solution.createEmployeeRecords("Sally", "Webber", "Web Developer", "2015-12-18");


        assertEquals(expected, actual);

    }
}