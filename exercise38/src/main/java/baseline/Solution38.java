/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */

/*
//prompt for a list of numbers
//create a list of new numbers by converting the input to array
//filter/remove the numbers that are not even numbers from the list
//print out the new list with the removed numbers
 */

package baseline;
import java.util.Arrays;
import java.util.Scanner;


public class Solution38 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        //create solution
        Solution38 solution = new Solution38();
        //create list of numbers
        int[] numbersList = solution.promptNewList();
        //filter out even numbers from the list
        numbersList = solution.filterEvenNumbers(numbersList);
        //print the list of remaining numbers
        solution.printNewList(numbersList);

    }

    private int[] promptNewList()
    {

        System.out.println("Enter a list of numbers, separated by spaces: ");
        String integers = input.nextLine();
        int[] numberArray = Arrays.stream(integers.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int j : numberArray)
        {
            System.out.println(j);
        }
        return numberArray;
    }

    public int[] filterEvenNumbers(int[] numbersList)
    {
        //check for each number in the list
        for(int i = 0; i < numbersList.length;)
        {
            //if the list is NOT equal to 0 when moduled by 2 (aka is odd), remove it
            if (numbersList[i] % 2 != 0)
            {
                //make a copy of the original list
                int[] copyOfNumbersList = new int[numbersList.length - 1];


                for (int j = 0, k = 0; j < numbersList.length; j++)
                {
                    //skip the index of the odd number
                    if (j == i)
                    {
                        continue;
                    }

                    //copy all elements from original array except specific index
                    copyOfNumbersList[k++] = numbersList[j];

                }
                //make the original list equal to the new list
                numbersList = copyOfNumbersList;
            }
            //if it is equal to 0 when moduled by 2 (aka even), ignore and advance i by 1.
            else
            {
                i++;
            }
        }
        return numbersList;
    }



    private void printNewList(int[] newNumberList)
    {
        System.out.print("The even numbers are ");
        for(int i = 0; i < newNumberList[i]; i++)
        {
            System.out.printf("%d ", newNumberList[i]);
        }

    }



}

