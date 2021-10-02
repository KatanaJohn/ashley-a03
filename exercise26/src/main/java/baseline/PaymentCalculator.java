package baseline;
import java.util.Scanner;

public class PaymentCalculator {

    private static final Scanner input = new Scanner(System.in);
    private double balance;
    private double APR;
    private double payment;

    public double calculateMonthsUntilPaidOff()
    {
        //get the daily rate
        double dailyRate = APR / 365.0;
        //calculate the pay off time/months to pay off card
        return Math.ceil(-((1.0/30) * Math.log(1 + (Math.round(balance/payment*100)/100.0) * (1 - Math.pow((1 + dailyRate), 30))) / Math.log(1+ dailyRate)));
    }


    public double takeBalanceInput(double balance)
    {
        //get the input for balance
        this.balance = balance;
        return balance;
    }


    public double takeAprInput(double APR)
    {

        //Get input for APR and divide by 100
        this.APR = APR / 100.0;
        return APR;
    }

    public double takeMonthlyInput(double payment)
    {
        //Get input for monthly payment
        this.payment = payment;
        return payment;
    }
}
