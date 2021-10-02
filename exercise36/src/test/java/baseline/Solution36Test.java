package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {

    Solution36 solution = new Solution36();

    @Test
    void averageTest()
    {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        double expected = 400.0;
        double actual = solution.average(numberList);
        assertEquals(expected, actual, 1);
    }

    @Test
    void minTest()
    {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        int expected = 100;
        int actual = solution.min(numberList);
        assertEquals(expected, actual);
    }


    @Test
    void maxTest()
    {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        int expected = 1000;
        int actual = solution.max(numberList);
        assertEquals(expected, actual);
    }

    @Test
    void stdTest()
    {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(100);
        numberList.add(200);
        numberList.add(1000);
        numberList.add(300);

        double average = 400.0;

        double expected = 353.55;
        double actual = solution.std(numberList, average);
        assertEquals(expected, actual, .01);
    }

}