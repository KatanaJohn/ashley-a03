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

        List<String> employeeList = new ArrayList<>(5);
        employeeList.add("Ariana Grande");
        employeeList.add("5SOS");
        employeeList.add("BLACKPINK");
        employeeList.add("Queen");
        employeeList.add("Taylor Swift");
        employeeList = solution.removeEmployee(employeeList, "Queen");
        int actual = solution.decreaseEmployeeCount(nEmployees, employeeList);
        assertEquals(expected, actual);
    }

    @Test
    void testEmployeeRemoval()
    {
        Solution34 solution = new Solution34();

        ArrayList<String> employeeList = new ArrayList<>(5);
        employeeList.add("Ariana Grande");
        employeeList.add("5SOS");
        employeeList.add("BLACKPINK");
        employeeList.add("Queen");
        employeeList.add("Taylor Swift");

        String removedEmployee = "Ariana Grande";

        String expected = "5SOS";
        List<String> actualList = solution.removeEmployee(employeeList, removedEmployee);
        String actual = actualList.get(0);

        assertEquals(expected, actual);
    }

}