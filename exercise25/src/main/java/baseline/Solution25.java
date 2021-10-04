/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */



package baseline;
import java.util.Scanner;


//take in password using method takeUserInput
//use an integer that changes for each of the following:
    //check if the password contains letters and not numbers/specials and is <8 char
    //check if the password contains letters and not numbers and <8
    //check if the password contains letters/numbers & >8
    //check if the password contains num, letter, and special and >8
//output the password's strength based on the returned integer


public class Solution25 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        //create new object solution
        Solution25 solution = new Solution25();
        //take user input for password
        String pass = solution.takeUserInput();

        //get the password strength
        int passwordStrength = solution.passwordStrengthIndicator(pass);

        //state what the passsword strength is
        solution.output(passwordStrength, pass);
    }


    private String takeUserInput()
    {
        //take input then return it to string pass
        System.out.println("Please enter a password and I'll check the strength.");
        return input.nextLine();
    }



    public int passwordStrengthIndicator(String pass)
    {
        int passwordStrength;
        boolean containsLetters = false;
        boolean containsNumber = false;
        boolean containsSpecial = false;

        //create a character array and check if the password contains letters, numbers, and specials
        char[] passArray = pass.toCharArray();
        for(char p : passArray)
        {
            if(Character.isAlphabetic(p))
            {
                containsLetters = true;
            }
            else if(Character.isDigit(p))
            {
                containsNumber = true;
            }
            else if(!Character.isAlphabetic(p) && !(Character.isDigit(p)))
            {
                containsSpecial = true;
            }
        }

        //use the booleans to do each specific check
        //if it contains only numbers & <8
        if(!containsLetters && containsNumber && !containsSpecial && pass.length() < 8)
        {
            passwordStrength = 1;
        }
        //if it contains only letters & <8
        else if(containsLetters && !containsNumber && !containsSpecial && pass.length() < 8)
        {
            passwordStrength = 2;
        }
        //if it contains letters and numbers and >8
        else if(containsLetters && containsNumber && !containsSpecial && pass.length() >= 8)
        {
            passwordStrength = 3;
        }
        //if it contains letters/numbers/special char and > 8
        else if(containsLetters && containsNumber && containsSpecial && pass.length() >= 8)
        {
            passwordStrength = 4;
        }
        //if none of the above
        else
        {
            passwordStrength = 0;
        }

        //return password strength
        return passwordStrength;
    }

    private void output(int passwordStrength, String password)
    {
        //state the strength of the password 
        if(passwordStrength == 0)
        {
            System.out.printf("The password %s is of an unknown strength", password);
        }
        else if(passwordStrength == 1)
        {
            System.out.printf("The password %s is a very weak password.", password);
        }
        else if(passwordStrength == 2)
        {
            System.out.printf("The password %s is a weak password.", password);
        }
        else if(passwordStrength == 3)
        {
            System.out.printf("The password %s is a strong password.", password);
        }
        else if(passwordStrength == 4)
        {
            System.out.printf("The password %s is a very strong password.", password);
        }
    }

}
