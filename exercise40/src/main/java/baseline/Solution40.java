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
        //a list of maps so that we can store all the information
        List<Map<String, String>> employeeRecords = new ArrayList<>();

        //the map including all of the employee info. adding a new employee 6 times
        Map<String, String> employees = solution.createEmployeeRecords("John", "Johnson", "Manager", "2016-12-31");
        employeeRecords.add(employees);

        employees = solution.createEmployeeRecords("Tou", "Xiong", "Software Engineer", "2016-10-05");
        employeeRecords.add(employees);

        employees = solution.createEmployeeRecords("Michaela", "Michaelson", "District Manager", "2015-12-19");
        employeeRecords.add(employees);

        employees = solution.createEmployeeRecords("Jake", "Jacobson", "Programmer", "N/A");
        employeeRecords.add(employees);

        employees = solution.createEmployeeRecords("Jacquelyn", "Jackson", "DBA", "N/A");
        employeeRecords.add(employees);

        employees = solution.createEmployeeRecords("Sally", "Webber", "Web Developer", "2015-12-18");
        employeeRecords.add(employees);

        String searchInput = solution.getSearchInput();

        solution.printSearchInfo(employeeRecords, searchInput);
    }


    public Map<String, String> createEmployeeRecords(String fName, String lName, String currentPosition, String separationD)
    {
        //create new hashmap to add the information to
        Map<String, String> employees = new HashMap<>();

        //add all the string information of each employee into the hashmap
        employees.put(FIRSTNAME, fName);
        employees.put(LASTNAME, lName);
        employees.put(POSITION, currentPosition);
        employees.put(SEPARATIONDATE, separationD);

        //return the hashmap to be added
        return employees;
    }

    private String getSearchInput()
    {
        //ask for search string input and return input
        System.out.println("Enter a search string: ");
        return input.nextLine();
    }

    private void printSearchInfo(List<Map<String, String>> employeeRecords, String searchInput)
    {
        //formatting
        System.out.printf("%12s %12s| %20s| %12s%n", "", "Name", "Position", "Separation Date");

        //for loop for each employee in records
        for(Map<String, String> employees : employeeRecords)
        {
            //if statement to check for search input before printing. if the searchinput is included, print
            if (employees.get(FIRSTNAME).contains(searchInput) || employees.get(LASTNAME).contains(searchInput))
            {
                System.out.printf("%12s %12s| %20s| %12s%n", employees.get(FIRSTNAME), employees.get(LASTNAME), employees.get(POSITION), employees.get(SEPARATIONDATE));
            }
        }


    }

}
