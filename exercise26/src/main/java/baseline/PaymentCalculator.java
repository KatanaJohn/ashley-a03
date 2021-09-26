package baseline;
import java.util.Scanner;

public class PaymentCalculator {

    private static final Scanner input = new Scanner(System.in);

    public double calculateMonthsUntilPaidOff()
    {
        double balance = takeBalanceInput();
        double APR = takeAprInput();
        double monthlyPayment = takeMonthlyInput();
        double dailyRate = APR / 365.0;
        return -((1.0/30) * Math.log(1 + (Math.round(balance/monthlyPayment*100)/100.0) * (1 - Math.pow((1 + dailyRate), 30))) / Math.log(1+ dailyRate));
    }

    private double takeBalanceInput()
    {
        double balance;
        System.out.println("What is your balance? ");
        balance = input.nextDouble();
        return balance;
    }


    private double takeAprInput()
    {
        double APR;
        System.out.println("What is the APR on the card (as a percent)? ");
        APR = input.nextInt() / 100.0;
        return APR;
    }

    private double takeMonthlyInput()
    {
        double payment;
        System.out.println("What is the monthly payment you can make? ");
        payment = input.nextDouble();
        return payment;
    }
}
