/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */

/*
- create array/add names to array (no input)
- display number of employees and names
- promopt for a name to be removed
- take that name and remove it from array list
- display number of employees/names again
 */

package baseline;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Solution34 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        Solution34 solution = new Solution34();

        //initialize number of employees
        int nEmployees = 5;

        //initialize list
        List<String> employeesList;
        //create list of employees
        employeesList = solution.createEmployeesList();
        //display the employees before removing one
        solution.displayEmployees(nEmployees, employeesList);
        //take input for the employee someone wants to remove
        String removedEmployee = solution.removeEmployeeInput();
        //remove the employee that was input
        employeesList = solution.removeEmployee(employeesList, removedEmployee);
        //decrease the employee count
        nEmployees = solution.decreaseEmployeeCount(nEmployees, employeesList);
        //display the employees after the removal
        solution.displayEmployees(nEmployees, employeesList);
    }

    private ArrayList<String> createEmployeesList()
    {
        ArrayList<String> employeeList = new ArrayList<String>(5);

        //for this specific exercise we're just adding names manually.
        employeeList.add("Ariana Grande");
        employeeList.add("5SOS");
        employeeList.add("BLACKPINK");
        employeeList.add("Queen");
        employeeList.add("Taylor Swift");

        return employeeList;
    }

    private void displayEmployees(int nEmployees, List<String> employeeList)
    {
        //display the number of employees
        System.out.printf("There are %d Employees%n", nEmployees);

        //display the names of all employees
        for(int i = 0; i < nEmployees; i++)
        {
            System.out.printf("%s%n", employeeList.get(i));
        }
    }

    public List<String> removeEmployee(List<String> employeeList, String removedEmployee)
    {

        //remove the employee from the list
        employeeList.remove(removedEmployee);

        return employeeList;
    }

    private String removeEmployeeInput()
    {
        //ask for the name of the employee user wants to remove
        System.out.println("Enter an employee name to remove: ");
        return input.nextLine();

    }

    public int decreaseEmployeeCount(int nEmployees, List<String> employeesList)
    {
        //if an employee was removed, decrease nemployees size. If no employee was removed, just return the same value
        if(employeesList.size() < 5)
        {
            nEmployees--;
            return nEmployees;
        }

        return nEmployees;

    }



}
