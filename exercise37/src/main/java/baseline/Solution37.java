/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


/*
prompt for minimum length of password, special characters, and numbers
if the number % by 2 is not equal to 0, add 1 to it (for letter = number/SC requirement
create a list and randomly generate characters into it.
check for letter/number limit
put the characters into a string through a for loop
shuffle the string

 */

package baseline;
import java.util.*;


public class Solution37 {

    private static final Scanner input = new Scanner(System.in);
    private final Random rand = new Random();

    public static void main(String[] args)
    {
        Solution37 solution = new Solution37();

        //prompt for min length of pass
        int minLength = solution.promptPasswordLength();
        //prompt for number of special character
        int numSpecials = solution.promptNumOfSpecial();
        //prompt for number of integers
        int numNumbers = solution.promptNumbers();
        //calculate number of letters so there are as many as specials+numbers
        int numLetters = solution.calculateLetters(numSpecials, numNumbers, minLength);
        //calculate the final total
        int finalLength = solution.recalculateMinimumLength(numSpecials, numNumbers, numLetters);

        //generate characters into a list
        List characterList = solution.generateCharacters(numLetters, numNumbers, finalLength);
        //create the password using the list
        String password = solution.createPassword(characterList);
        //randomize the password by shuffling all its characters
        password = solution.shufflePassword(password);
        //print the final password
        solution.printPassword(password);

    }

    private int promptPasswordLength()
    {
        //ask and return minimum length/input
        System.out.println("What's the minimum length?");
        return input.nextInt();
    }

    private int promptNumOfSpecial()
    {
        //ask and return number of special characters/input
        System.out.println("How many special characters?");
        return input.nextInt();
    }

    private int promptNumbers()
    {
        //ask and return number of integers/input
        System.out.println("How many numbers?");
        return input.nextInt();
    }

    private int calculateLetters(int specials, int numbers, int minLength)
    {
        //generate number of letters by finding remaining spots left
        int letters = minLength - (specials + numbers);

        //if number of letters is less than specials + numbers, set it to same amount of specials/numbers
        if(letters < (specials + numbers))
        {
            letters = specials + numbers;
        }

        return letters;
    }

    private int recalculateMinimumLength(int specials, int letters, int numbers)
    {
        //return new length after calculating letters
        return (specials + letters + numbers);
    }


    private List<String> generateCharacters(int letters, int numbers, int minLength)
    {
        //create new list
        List characterList = new ArrayList();

        //set upperbound for adding numbers 0-9
        int upperbound = 10;

        //add random letters for x amount of letters
        for(int i = 0; i < letters; i++)
        {
            characterList.add((char)( rand.nextInt(26) + 'a'));
        }

        //add random numbers 0-9 for x amount of numbers
        for(int i = letters; i < (letters + numbers); i++)
        {
            characterList.add(rand.nextInt(upperbound));
        }

        //set special string
        String specialCharacters = "!@#$%&";

        //add random special characters
        for(int i = letters+numbers; i < minLength; i++)
        {
            characterList.add(specialCharacters.charAt(rand.nextInt(specialCharacters.length())));
        }

        return characterList;
    }

    private String createPassword(List characterList)
    {
        //use a string builder and add all the characters from the list to a string
        StringBuilder password = new StringBuilder();
        for (Object o : characterList) {
            password.append(o);
        }

        System.out.println(password);
        return password.toString();
    }

    private String shufflePassword(String password)
    {
        /*use a list and string builder to create a new password string that randomly generates
        a new password based on the characters of the original one*/
        List<String> characters = Arrays.asList(password.split(""));
        Collections.shuffle(characters);
        StringBuilder newPassword = new StringBuilder();
        for (String character : characters)
        {
            newPassword.append(character);
        }
        System.out.println(newPassword);
        return newPassword.toString();
    }

    private void printPassword(String password)
    {
        //print the password
        System.out.printf("Your password is %s", password);
    }


}



