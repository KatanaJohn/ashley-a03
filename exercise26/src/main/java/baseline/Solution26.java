package baseline;
import java.util.Scanner;

/*
Prompt for the card’s APR. Do the division internally.
Prompt for the APR as a percentage, not a decimal.
Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff, which takes no parameters and returns the number of months.
Round fractions of a cent up to the next cent for internal calculations
n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
 */

//prompt for balance
//prompt for apr on the card as a percentage and divide internally
//prompt for monthly payment you can make
//calculate how many months it will take to pay off the card using formula




public class Solution26 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        PaymentCalculator calculator = new PaymentCalculator();
    }

    private int takeBalanceInput()
    {

    }


    private int takeAprInput()
    {

    }

    private int takeMonthlyInput()
    {

    }




}
