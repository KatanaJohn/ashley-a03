package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    @Test
    void testPaymentCheck()
    {
        PaymentCalculator calculator = new PaymentCalculator();

        calculator.takeBalanceInput(5000);
        calculator.takeAprInput(12);
        calculator.takeMonthlyInput(100);

        assertEquals(70, calculator.calculateMonthsUntilPaidOff());
    }
}