/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


/*
(similar steps to before, with the change from organizing by last name to filtering out results)
create a list of maps
manually add the first name, last name, position, and separation date to a hashmap(since we're looking at a specific set of names/positions/dates
add the hashmaps to the list
prompt user input for search string
search for string within first and last name
print out the information for those names
 */


package baseline;
import java.util.*;



public class Solution40 {

    private static final Scanner input = new Scanner(System.in);
    private static final String FIRSTNAME = "firstName";
    private static final String LASTNAME = "lastName";
    private static final String POSITION = "position";
    private static final String SEPARATIONDATE = "separationDate";

    public static void main(String[] args)
    {
        Solution40 solution = new Solution40();

    }


    public Map<String, String> createEmployeeRecords(String fName, String lName, String currentPosition, String separationD)
    {

    }

    private String getSearchInput()
    {
    }

    private void printSearchInfo(List<Map<String, String>> employeeRecords, String searchInput)
    {

    }

}
