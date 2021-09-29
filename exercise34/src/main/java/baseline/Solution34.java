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

        int nEmployees = 5;

        List employeesList;
        employeesList = solution.createEmployeesList();
        solution.displayEmployees(nEmployees, employeesList);
        String removedEmployee = solution.removeEmployeeInput();
        employeesList = solution.removeEmployee(employeesList, removedEmployee);
        nEmployees = solution.decreaseEmployeeCount(nEmployees, employeesList);
        solution.displayEmployees(nEmployees, employeesList);
    }

    private ArrayList createEmployeesList()
    {
        ArrayList employeeList = new ArrayList(5);

        //for this specific exercise we're just adding names manually.
        employeeList.add("Ariana Grande");
        employeeList.add("5SOS");
        employeeList.add("BLACKPINK");
        employeeList.add("Queen");
        employeeList.add("Taylor Swift");

        return employeeList;
    }

    private void displayEmployees(int nEmployees, List employeeList)
    {
        System.out.printf("There are %d Employees%n", nEmployees);

        for(int i = 0; i < nEmployees; i++)
        {
            System.out.printf("%s%n", employeeList.get(i));
        }
    }

    public List removeEmployee(List employeeList, String removedEmployee)
    {

        employeeList.remove(removedEmployee);

        return employeeList;
    }

    private String removeEmployeeInput()
    {
        System.out.println("Enter an employee name to remove: ");
        return input.nextLine();

    }

    public int decreaseEmployeeCount(int nEmployees, List employeesList)
    {
        if(employeesList.size() < 5)
        {
            nEmployees--;
            return nEmployees;
        }

        return nEmployees;

    }



}
