/*
 * UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 John Ashley
 */


package baseline;

//prompt for balance
//prompt for apr on the card as a percentage and divide internally
//prompt for monthly payment you can make
//calculate how many months it will take to pay off the card using formula (n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i))


import java.util.Scanner;

public class Solution26 {

    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {


        PaymentCalculator calculator = new PaymentCalculator();

        //get the input for balance
        System.out.println("What is your balance? ");
        calculator.takeBalanceInput(input.nextDouble());

        //Get input for APR and divide by 100
        System.out.println("What is the APR on the card (as percent)? ");
        calculator.takeAprInput(input.nextDouble());

        //Get input for monthly payment
        System.out.println("What is the monthly payment you can make? ");
        calculator.takeMonthlyInput(input.nextDouble());

        //calculate the pay off time/months to pay off card
        double payoffTime = calculator.calculateMonthsUntilPaidOff();
        System.out.printf("It will take you %.0f months to pay off this card", payoffTime);
    }






}
