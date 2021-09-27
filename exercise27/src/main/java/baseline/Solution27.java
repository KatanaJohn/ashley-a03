/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


package baseline;
import java.util.Scanner;
import java.util.Objects;


public class Solution27 {


    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args)
    {
        //create new solution
        Solution27 solution = new Solution27();

        //prompt and get any input needed
        String firstName = solution.promptFirstName();
        String lastName = solution.promptLastName();
        String zip = solution.promptZipCode();
        String ID = solution.promptEmployeeID();

        //check for validation/errors of any of the input
        solution.validateInput(firstName, lastName, zip, ID);
    }

    private String promptFirstName()
    {
        //prompt for input and return it
        System.out.println("Enter the first name: ");
        return input.nextLine();
    }

    private String promptLastName()
    {
        //prompt for input and return it
        System.out.println("Enter the last name:  ");
        return input.nextLine();
    }

    private String promptZipCode()
    {
        //prompt for input and return it
        System.out.println("Enter the ZIP code: ");
        return input.nextLine();
    }

    private String promptEmployeeID()
    {
        //prompt for input and return it
        System.out.println("Enter the employee ID: ");
        return input.nextLine();
    }

    private boolean validateFirstName(String firstName)
    {
        //set boolean for error to false
        boolean firstNameError = false;

        //if first name is less than 2 characters, set error to true
        if(firstName.length() < 2)
        {
            firstNameError = true;
            return firstNameError;
        }

        //if first name contains something other than a letter, indicate an error
        char[] nameCheck = firstName.toCharArray();
        for(char p : nameCheck)
        {
            if (!Character.isAlphabetic(p))
            {
                firstNameError = true;
                return firstNameError;
            }
        }

        return firstNameError;
    }

    private boolean validateLastName(String lastName)
    {
        //set boolean for error to false.
        boolean lastNameError = false;

        //if last name is less than 2 characters, indicate an error
        if(lastName.length() < 2)
        {
            lastNameError = true;
            return lastNameError;
        }

        //if last name contains something other than a letter, indicate an error
        char[] nameCheck = lastName.toCharArray();
        for(char p : nameCheck)
        {
            if (!Character.isAlphabetic(p))
            {
                lastNameError = true;
                return lastNameError;
            }
        }

        return lastNameError;
    }

    private boolean validateZipCode(String zipCode)
    {
        boolean zipCodeError = false;

        //if zipcode is not length of 5, set error to true
        if(zipCode.length() != 5)
        {
            zipCodeError = true;
            return zipCodeError;
        }


        //change zipcode to array
        char[] zipCheck = zipCode.toCharArray();

        //for each number, check if it is a digit. if not, set error to true
        for(int i = 0; i < 5; i++)
        {
            for(char p : zipCheck)
            {
                if (!Character.isDigit(p))
                {
                    zipCodeError = true;
                    return zipCodeError;
                }
            }
        }

        return zipCodeError;
    }

    private boolean validateEmployeeID(String ID)
    {
        boolean idCodeError = false;

        //if id is not a length of 7, set error to true
        if(ID.length() != 7)
        {
            idCodeError = true;
            return idCodeError;
        }


        //change string to array
        char[] idCheck = ID.toCharArray();

        //for each character, check if its valid based on letter(0-1), hyphen(2), and number(3-6)
        for(int i = 0; i < 6; i++)
        {
                if(i<2 && !Character.isLetter(idCheck[i]))
                {
                    System.out.println("Hi");
                    idCodeError = true;
                    return idCodeError;
                }

                if(i==2 && !Objects.equals(idCheck[i], '-'))
                {
                    System.out.println("Hi");
                    idCodeError = true;
                    return idCodeError;
                }

                if(i>2 && !Character.isDigit(idCheck[i]))
                {
                    System.out.println("Hiiii");
                    idCodeError = true;
                    return idCodeError;
                }
            }
        return idCodeError;
        }

    public int validateInput(String firstName, String lastName, String zip, String ID)
    {
        int errors = 0;

        //check the validation for each error function. if the error is true, state there is an error.
        if(validateFirstName(firstName))
        {
            errors++;
            System.out.println("The first name must be at least 2 characters long.");
        }
        if(validateLastName(lastName))
        {
            errors++;
            System.out.println("The last name must be at least 2 characters long.");
        }
        if(validateZipCode(zip))
        {
            errors++;
            System.out.println("The zipcode must be a 5 digit number.");
        }
        if(validateEmployeeID(ID))
        {
            errors++;
            System.out.println("The employee ID must be in the format of AA-1234.");
        }
        //if there is no error, state there are no errors
        if(errors == 0)
        {
            System.out.println("There were no errors found");
            return 1;
        }
        return 0;
    }
}
