/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


/*
ask for difficulty
generate a random number
create a function for the guessing and use a while loop.
create a function asking to play again
have a do while loop with boolean playAgain
 */


package baseline;
import java.util.Random;
import java.util.Scanner;



public class Solution32 {

    private static final Scanner input = new Scanner(System.in);
    Random rand = new Random();


    public static void main(String[] args)
    {

        Solution32 solution = new Solution32();
        boolean playAgain;
        do
        {
            //gets the difficulty input
            int difficulty = solution.askForDifficulty();
            //gets the randomly generated answer
            int answer = solution.generateAnswer(difficulty);
            //gets the max possible value that can be guessed
            int maxValue = solution.getMaxPossibleValue(difficulty);
            //starts the guessing game
            solution.playGuessingGame(answer, maxValue);
            //asks if player would like to play again
            String userPlayAgain = solution.askToPlayAgain();
            //checks and returns boolean based on if user wanted to play again
            playAgain = solution.checkPlayAgain(userPlayAgain);
        } while(playAgain);

    }

    private int askForDifficulty() {
        boolean isANumber = false;
        String str;
        int difficulty = 0;

        while (!isANumber) {
            System.out.println("Enter the difficulty level (1, 2, or 3): ");
            str = input.nextLine();

            //if the integer can be parsed proceed. If not, ask for input again
            try
            {
                Integer.parseInt(str);
                //if the integer is <=0, ask for input again
                if (Integer.parseInt(str) > 0 && Integer.parseInt(str) <= 3)
                {
                    isANumber = true;
                    difficulty = Integer.parseInt(str);
                    return difficulty;
                } else
                {
                    System.out.println("Sorry. That's not a valid input");
                }
            } catch (NumberFormatException e)
            {
                System.out.println("Sorry. That's not a valid input");
            }

        }
        return difficulty;
    }

    private int generateAnswer(int difficulty)
    {
        int answer = 0;
        //randomly select a number 1-10 if difficulty is 1
        if(difficulty == 1)
        {
            answer = this.rand.nextInt(9) + 1;
            return answer;
        }
        //randomly selects a number from 1-100 if difficulty is 2
        else if(difficulty == 2)
        {
            answer = this.rand.nextInt(99) + 1;
            return answer;
        }
        //randomly selects a number from 1-1000 if difficulty is 3
        else if(difficulty == 3)
        {
            answer = this.rand.nextInt(999) + 1;
            return answer;
        }

        return answer;
    }

    private void playGuessingGame(int answer, int maxValue)
    {
        int guessCount = 0;
        String guess;
        int checkGuess = 0;
        System.out.println("I have my number. What's your guess? ");

        //the game. loops until the guess is equal to the answer
        do
        {
            guess = getGuess();

            //checks if it
            try
            {
                Integer.parseInt(guess);
                checkGuess = Integer.parseInt(guess);
                guessCount++;

                //if the integer is greater than the max possible value, it is indicated.
                if(Integer.parseInt(guess) < 0 || Integer.parseInt(guess) > maxValue)
                {
                    System.out.println("That value is not within range. Guess again: ");
                }
                //checks if the value is too high
                else if(Integer.parseInt(guess) > answer)
                {
                    System.out.println("Too high. Guess again: ");
                }
                //checks if the value is too low
                else if(Integer.parseInt(guess) < answer)
                {
                    System.out.println("Too low. Guess again: ");
                }
            }
            //if the input is not a valid number, it's indicated and guess count increases.
            catch(NumberFormatException e)
            {
                System.out.println("That is not a possible answer. Guess again: ");
                guessCount++;
            }

        } while(checkGuess != answer);
            System.out.printf("You got it in %d guesses%n", guessCount);
    }

    private String getGuess()
    {
        return input.nextLine();
    }


    public int getMaxPossibleValue(int difficulty)
    {
        //checks the difficulty and gets a max possible value to tell the user if they're going over when guessing
        if(difficulty == 1)
        {
            return 10;
        }
        else if(difficulty == 2)
        {
            return 100;
        }
        else
        {
            return 1000;
        }
    }

    private String askToPlayAgain()
    {

        //asks the user if they want to play again and gets input
        System.out.println("Do you wish to play again (y/n");
        return input.nextLine();
    }


    public boolean checkPlayAgain(String response)
    {
        //if the input is y, then the game loops. if it is anything else, the game ends.
        if(response.equals("y"))
        {
            return true;
        }
        else if(response.equals("n"))
        {
            return false;
        }

        return false;

    }





}