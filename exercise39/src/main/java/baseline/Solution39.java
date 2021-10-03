/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


/*
create a list of maps
manually add the first name, last name, position, and separation date to a hashmap(since we're looking at a specific set of names/positions/dates
add the hashmaps to the list
organize the list of maps by last name
print out the hash map
 */


package baseline;
import java.util.*;


public class Solution39 {

    private static final String FIRSTNAME = "firstName";
    private static final String LASTNAME = "lastName";
    private static final String POSITION = "position";
    private static final String SEPARATIONDATE = "separationDate";



    public static void main(String[] args)
    {
        Solution39 solution = new Solution39();
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

        solution.printEmployeeRecords(employeeRecords);

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

    private void printEmployeeRecords(List<Map<String, String>> employeeRecords)
    {
        //sort the employee records by last name
        employeeRecords.sort(Comparator.comparing(map -> map.get(LASTNAME)));


        //formatting
        System.out.printf("%12s %12s| %20s| %12s%n", "", "Name", "Position", "Separation Date");

        //print the employee records
        for(Map<String, String> employees : employeeRecords)
        {
            System.out.printf("%12s %12s| %20s| %12s%n", employees.get(FIRSTNAME), employees.get(LASTNAME), employees.get(POSITION), employees.get(SEPARATIONDATE));
        }

    }

}
