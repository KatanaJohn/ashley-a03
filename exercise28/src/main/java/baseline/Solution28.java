/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


package baseline;
import java.util.Scanner;

//make function prompting for a number
//add that number for an array
//create a for loop within that function that is done 5 times
//have a sum variable that adds the value input by the user to the sum


public class Solution28 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        //create new solution
        Solution28 solution = new Solution28();

        //create an array of integers based on input
        int[] numberList = solution.makeNumberArray();
        //calculate the sum of the 5 numbers
        int sum = solution.calculator(numberList);

        //print out the calculated sum of the 5 numbers
        System.out.printf("The total is %d", sum);
    }


    private int[] makeNumberArray()
    {
        //create integer array
        int[] numberList = new int[5];

        //ask for input from user and add it to the array
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number: ");
            numberList[i] = input.nextInt();
        }

        return numberList;
    }

    public int calculator(int[] numberList)
    {
        //sum variable
        int sum = 0;

        //for loop adding all the numbers from the array
        for(int i = 0; i < 5; i++)
        {
            sum += numberList[i];
        }

        //return sum to main
        return sum;
    }

}
