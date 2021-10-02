package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {


    @Test
    void testWinner()
    {
        Solution35 solution = new Solution35();

        ArrayList<String> playerList = new ArrayList<>(9);
        playerList.add("Li");
        playerList.add("Juan");
        playerList.add("Fatemah");
        playerList.add("Noah");
        playerList.add("Cody");
        playerList.add("Xaria");
        playerList.add("Esin");
        playerList.add("Guillermo");
        playerList.add("Hollander");

        String expected = "Hollander";
        String actual = solution.getWinner(8, playerList);
        assertEquals(expected, actual);


    }

}