package Payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPayments {
    @Test
    public void testCard() {
        Payment card = new CreditCardPayment(40);
        Assertions.assertEquals(card.pay(), "Credit card payment is successful");
    }
    @Test
    public void testPayPal() {
        Payment paypal = new PayPalPayment(40);
        Assertions.assertEquals(paypal.pay(), "PayPal payment is successful");
    }
}
