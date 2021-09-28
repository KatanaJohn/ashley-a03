/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


package baseline;

//create makeMultiplicationTable function
//nested for loop using two variables.
//first loop cycles from first variable starting at 1 up to 12
//second loop cycles from second variable starting at 1 up to 12.
//function for doing math


public class Solution30 {


    public static void main(String[] args)
    {
        //create new solution
        Solution30 solution = new Solution30();
        solution.makeMultiplicationTable();
    }


    private void makeMultiplicationTable()
    {
        int a;
        int b;

        //cycles through first number 1-12
        for(a = 1; a <=12; a++)
        {
            //multiplies a with each number from 1-12 then prints
            for(b=1; b <=12; b++)
            {
                System.out.printf("%4d", a*b);

            }
            //prints new line after each numbers' possible multiples.
            System.out.printf("%n");
        }
    }
}
