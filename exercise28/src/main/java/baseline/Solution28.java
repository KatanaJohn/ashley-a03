/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


package baseline;
import java.util.Scanner;

//make function prompting for a number
//create a for loop within that function that is done 5 times
//have a sum variable that adds the value input by the user to the sum


public class Solution28 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        //create new solution
        Solution28 solution = new Solution28();

        //calculate the sum of the 5 numbers
        int sum = solution.calculator();

        //print out the calculated sum of the 5 numbers
        System.out.printf("The total is %d", sum);
    }

    private int calculator()
    {
        //sum variable
        int sum = 0;

        //for loop adding new number that was input to sum
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Enter a number: ");
            sum +=input.nextInt();
        }

        //return sum to main
        return sum;
    }

}
