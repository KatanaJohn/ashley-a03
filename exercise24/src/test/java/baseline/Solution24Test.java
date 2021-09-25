package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {
    @Test
    void test_anagram_check()
    {
        Solution24 solution = new Solution24();
        String str1 = "heart";
        String str2 = "earth";

        boolean actual = solution.isAnagram(str1, str2);
        boolean expected = true;

        assertEquals(expected, actual);
    }


}