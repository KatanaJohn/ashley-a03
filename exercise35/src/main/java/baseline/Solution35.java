/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


/*
create arraylist and ask for user input until they put a blank in. Terminate once a blank is put in
generate a random number within range and return it
take that number and get the name that matches the index of that number and return it
print the winner/the name
 */


package baseline;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;





public class Solution35 {

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        Solution35 solution = new Solution35();
        //create new array list with capacity of 10
        ArrayList<String> playerList;
        //create player list based on input from method
        playerList = solution.createPlayerList();

        //generate winning number
        int winningNumber = solution.generateNumber(playerList);
        //get the name from the index of the winning number
        String winningName = solution.getWinner(winningNumber, playerList);
        //display the winner
        solution.displayWinner(winningName);
    }

    private ArrayList<String> createPlayerList()
    {
        //set arraylist
        ArrayList<String> playerList = new ArrayList<>(10);

        //declare userInput string
        String userInput;

        //do while loop for getting names. If the userinput is blank, terminate loop.
        do
        {
            System.out.println("Enter a name: ");
            //get the name
            userInput = getInput();

            //check if the user input is blank. skip inputting if so
            if(!userInput.equals(""))
            {
                playerList.add(userInput);
            }


        } while(!userInput.equals(""));


        //return list
        return playerList;
    }


    private String getInput()
    {
        //return the name
       return input.nextLine();
    }


    private int generateNumber(ArrayList<String> playerList)
    {
        //generate a random number within range and return it
        Random random = new Random();
        return random.nextInt(playerList.size());
    }

    public String getWinner(int number, ArrayList<String> playerList)
    {
        //get the name of the winning player/index
        return playerList.get(number);
    }


    private void displayWinner(String winnerName)
    {
        //print the name of the winning player
        System.out.printf("The winner is %s", winnerName);
    }

}

