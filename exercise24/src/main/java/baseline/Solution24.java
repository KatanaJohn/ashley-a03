package baseline;
import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    //declare scanner for input
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        Solution24 solution = new Solution24();

        //declare two strings. String A and String B.
        String str1;
        String str2;

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        //ask the user for input for string a
        solution.askForStringOne();

        //then prompts for string
        str1 = input.nextLine();

        //ask the user for input for string b
        solution.askForStringTwo();

        //then prompt for string
        str2 = input.nextLine();

        //check if the two strings are anagrams of each other using an isAnagram function
        if(solution.isAnagram(str1, str2))
        {
            System.out.printf("%s and %s are anagrams", str1, str2);
        }
        else
        {
            System.out.printf("%s and %s are not anagrams", str1, str2);
        }



    }

    private void askForStringOne()
    {
        //print statement asking for string one
        System.out.println("Enter the first string: ");
    }

    private void askForStringTwo()
    {
        //print statement asking for string two
        System.out.println("Enter the second string: ");
    }

    public boolean isAnagram(String str1, String str2)
    {
        //check if the string lengths are the same
        if(str1.length() != str2.length())
        {
            return false;
        }



        //make each string an array of letters
        char[] str1Array = new char[str1.length()];
        char[] str2Array = new char[str2.length()];


        for(int i = 0; i < str1.length(); i++)
        {
            str1Array[i] = str1.charAt(i);
            str2Array[i] = str2.charAt(i);
        }

        //organize the arrays' letters
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        //compare letters one by one.
        //return false if not equal. true if all letters are equal.
        for(int i = 0; i < str1.length(); i++)
        {
            if(str1Array[i] != (str2Array[i]))
            {
                return false;
            }
        }
        return true;

    }


}
