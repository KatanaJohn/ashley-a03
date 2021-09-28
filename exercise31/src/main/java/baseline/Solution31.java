/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


//function to get resting heart  rate. Ensure a number is entered
//function to get age. Ensure a number is entered
//create a heartRate array and get heartRate
//display the results
//TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

package baseline;
import java.util.Scanner;


public class Solution31 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        Solution31 solution = new Solution31();
        int restingHeartRate = solution.getRestingHeartRate();
        int age = solution.getAge();
        int[] targetHeartRate = solution.calculateHeartRateArray(restingHeartRate, age);
        solution.displayResults(targetHeartRate);


    }


    private int getRestingHeartRate() {
        boolean isANumber = false;
        String str;
        int restingHeartRate = 0;
        //while the boolean isn't true, resting  HR
        while (!isANumber)
        {
            System.out.println("What is your resting heart rate? ");
            str = input.nextLine();
            //use a try/catch statement and parse the string. If it can be parsed, proceed. If not, ask for input again
            try
            {
                Integer.parseInt(str);
                isANumber = true;
                restingHeartRate = Integer.parseInt(str);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
        }
        return restingHeartRate;
    }


    private int getAge()
    {
        boolean isANumber = false;
        String str;
        int age = 0;
        //while the boolean isn't true, ask for age
        while (!isANumber)
        {
            System.out.println("What is your age? ");
            str = input.nextLine();
            //use a try/catch statement and parse the string. If it can be parsed, proceed. If not, ask for input again
            try
            {
                Integer.parseInt(str);
                isANumber = true;
                age = Integer.parseInt(str);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }
        }
        return age;
    }

    public int[] calculateHeartRateArray(int restingHeartRate, int age)
    {


        int intensity;

        //create an array of integers for the target HRS
        int[] targetHeartRate = new int[96];

        //for every increase in 5 from 55-95, calculate the target heart rate
        for(intensity = 55; intensity <= 95; intensity += 5)
        {
            targetHeartRate[intensity] = (int) ((((220 - age) - restingHeartRate) * (intensity/100.0)) + restingHeartRate);
        }

        return targetHeartRate;

    }

    private void displayResults(int[] targetHeartRate)
    {
        int intensity;

        //formatting
        System.out.println("\n  Intensity \t\t|  Rate");
        System.out.println("-----------------------");

        //for every increase in 5 from 55-95, display the intensity and its target HR.
        for(intensity = 55; intensity <= 95; intensity += 5)
        {
            System.out.printf("   %d \t|\t %d bpm%n", intensity, targetHeartRate[intensity]);
        }
    }

}
