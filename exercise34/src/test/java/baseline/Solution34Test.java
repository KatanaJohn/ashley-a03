package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution34Test {

    @Test
    void checkNumberOfEmployees()
    {
        Solution34 solution = new Solution34();

        int nEmployees = 5;
        int expected = 4;

        ArrayList employeeList = new ArrayList(5);
        employeeList.add("Ariana Grande");
        employeeList.add("5SOS");
        employeeList.add("BLACKPINK");
        employeeList.add("Queen");
        employeeList.add("Taylor Swift");


        int actual = solution.decreaseEmployeeCount(nEmployees, employeeList);
        assertEquals(expected, actual);
    }

    @Test
    void testEmployeeRemoval()
    {
        Solution34 solution = new Solution34();

        ArrayList employeeList = new ArrayList(5);
        employeeList.add("Ariana Grande");
        employeeList.add("5SOS");
        employeeList.add("BLACKPINK");
        employeeList.add("Queen");
        employeeList.add("Taylor Swift");

        String removedEmployee = "Ariana Grande";

        String expected = "5SOS";
        List actualList = solution.removeEmployee(employeeList, removedEmployee);
        String actual = (String) actualList.get(0);

        assertEquals(expected, actual);
    }

}