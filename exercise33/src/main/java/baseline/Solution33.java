/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */

/*
create array of responses
create a function to prompt for question
create function to choose a random response
have a function to generate random number
 */


package baseline;
import java.util.Scanner;
import java.util.Random;


public class Solution33 {

    private static final Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public static void main(String[] args)
    {
        Solution33 solution = new Solution33();

        solution.promptQuestion();

        String[] magicBall = solution.createMagicBall();

        int number = solution.generateNumber();

        String response = solution.generateResponse(magicBall, number);
        System.out.println(response);
    }

    private void promptQuestion()
    {
        System.out.println("What's your question?");
        input.nextLine();
    }

    private String[] createMagicBall()
    {
        //create new string array
        String[] magicBall  = new String[5];
        //add all the possible responses
        magicBall[0] = "Yes";
        magicBall[1] = "No";
        magicBall[2] = "Maybe";
        magicBall[3] = "Ask again later.";
        //return string array
        return magicBall;
    }

    private int generateNumber()
    {
        //initialize random

        int number;
        //randomly select a number from 0-3 and return it
        number = this.rand.nextInt(4);
        return number;
    }

    public String generateResponse(String[] magicBall, int number)
    {
        String response;

        //depending on the number randomly chosen, set the response string equal to the one from the magic ball index
        if(number == 0)
        {
            response = magicBall[0];
            return response;
        }
        else if(number == 1)
        {
            response = magicBall[1];
            return response;
        }
        else if(number == 2)
        {
            response = magicBall[2];
            return response;
        }
        else if(number == 3)
        {
            response = magicBall[3];
            return response;
        }

        //if not equal to any of them somehow, return invalid.
        return "Invalid";

    }

}

