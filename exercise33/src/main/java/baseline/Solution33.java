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


    public static void main(String[] args)
    {
        Solution33 solution = new Solution33();

        solution.promptQuestion();

        String[] magicBall = solution.createMagicBall();

        int number = solution.generateNumber();

        solution.generateResponse(magicBall, number);
    }

    private void promptQuestion()
    {
        System.out.println("What's your question?");
        input.nextLine();
    }

    private String[] createMagicBall()
    {
        String[] magicBall  = new String[50];
        magicBall[0] = "Yes";
        magicBall[1] = "No";
        magicBall[2] = "Maybe";
        magicBall[3] = "Ask again later.";
        return magicBall;
    }

    private int generateNumber()
    {
        Random rand = new Random();
        int number;
        number = rand.nextInt(4);
        return number;
    }

    private void generateResponse(String[] magicBall, int number)
    {
        System.out.printf("%s", magicBall[number]);
    }

}

