/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


package baseline;
import java.util.Scanner;



public class Solution29 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        Solution29 solution = new Solution29();
        //calculate the investment
        int rate = solution.getRateOfReturn();
        //calculate the years it will take to double the investment
        solution.calculateInvestment(rate);
    }

    private int getRateOfReturn()
    {
        boolean isANumber = false;
        String str;
        int rate = 0;
        //while the boolean isn't true, ask for the rate of return
        while(!isANumber)
        {
            System.out.println("What is the rate of return? ");
            str = input.nextLine();

            //if the integer can be parsed proceed. If not, ask for input again
            try
            {
                Integer.parseInt(str);
                //if the integer is <=0, ask for input again
                if(Integer.parseInt(str) > 0)
                {
                    isANumber = true;
                    rate = Integer.parseInt(str);
                }
                else
                {
                    System.out.println("Sorry. That's not a valid input");
                }
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }



        }
        return rate;
    }

    public int calculateInvestment(int rate)
    {
        //calculate investment years
        int years = 72 / rate;
        //print out the time it will take to double initial investment
        System.out.printf("It will take %d years to double your initial investment.", years);
        return years;
    }

}
