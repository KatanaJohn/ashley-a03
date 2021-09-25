package baseline;


public class Solution24 {

    public static void main(String[] args)
    {
        Solution24 solution = new Solution24();
        //declare two strings. String A and String B.
        String A;
        String B;


        //ask the user for input for string a
        solution.askForStringOne();
        //then prompts for string

        //ask the user for input for string b
        solution.askForStringTwo();
        //then prompt for string

        //check if the two strings are anagrams of each other using an isAnagram function
        solution.isAnagram(A, B);



    }

    private void askForStringOne()
    {
        //print statement asking for string one
    }

    private void askForStringTwo()
    {
        //print statement asking for string two
    }

    private boolean isAnagram(String A, String B)
    {
        //make each string an array of letters
        //compare letters one by one.
        //return false if not equal. true if equal.
    }


}
