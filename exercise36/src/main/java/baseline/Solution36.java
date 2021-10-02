/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */

/*
pseudocode
create an array list of integers that prompts for numbers until done is entered
calculate for the average of the numbers
find the minimum number by cycling through array to find lowest number
find the max number by cycling through array to find highest number
find the population standard deviation
 */

package baseline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class Solution36 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        Solution36 solution = new Solution36();
        //creates number list
        ArrayList<Integer> numberList = solution.createNumberList();

        //gets the average and prints it
        double average = solution.average(numberList);
        System.out.printf("The average is: %.1f%n", average);
        //gets the minimum
        solution.min(numberList);
        int min = solution.min(numberList);
        System.out.printf("The minimum is %d%n", min);
        //gets the maximum
        solution.max(numberList);
        int max = solution.max(numberList);
        System.out.printf("The maximum is %d%n", max);

        //gets the std
        double standardDev = solution.std(numberList, average);
        System.out.printf("The standard deviation is %.2f%n", standardDev);

    }


    private ArrayList<Integer> createNumberList()
    {
        ArrayList<Integer> numberList = new ArrayList<>();
        String userInput;
        //do while loop that ends at done.
        do
        {

            System.out.println("Enter a number: ");
            //gets user input from function getInput
            userInput = getInput();
            //if the string is not the word done, parse it and check if it's a valid integer.
            if(!userInput.equals("done"))
            {
                try
                {
                    Integer.parseInt(userInput);
                    //if the integer is valid, add it to the list
                    numberList.add(Integer.parseInt(userInput));
                }
                catch(NumberFormatException e)
                {
                    //if the integer is not valid, send error.
                    System.out.println("Sorry. That's not a valid input");
                }
            }
        } while(!userInput.equals("done"));

        //return list
        return numberList;
    }

    private String getInput()
    {
        //return the string input
        return input.nextLine();
    }

    public double average(List<Integer> integerList)
    {

        double average = 0;

        //add all the numbers in the list to the average
        for (Integer integer : integerList) {
            average += integer;
        }

        //divide by the amount of numbers in the list
        average /= integerList.size();
        //return the average (to use in std)
        return average;

    }

    public int max(List<Integer> integerList)
    {

        //check if the list is empty
        if (integerList.isEmpty()) {
            System.out.println("There are no numbers in the list");
            return 0;
        }
        //print the max integer
        else
        {
            return Collections.max(integerList);
        }


    }


    public int min(List<Integer> integerList)
    {
        //check if the list is empty
        if (integerList.isEmpty()) {
            System.out.println("There are no numbers in the list%n");
            return 0;
        }
        //print the min integer
        else
        {
            return Collections.min(integerList);
        }
    }

    public double std(ArrayList<Integer> integerList, double average)
    {
        double standardDev = 0;


        //use formula to get a value for next part
        for (Integer integer : integerList) {

            standardDev = standardDev + Math.pow((integer - average), 2);

        }
        //get the square root
        double sqrRoot = standardDev / integerList.size();
        //find the standard dev.
        standardDev = Math.sqrt(sqrRoot);
        //return the standard dev.
        return standardDev;

    }



}