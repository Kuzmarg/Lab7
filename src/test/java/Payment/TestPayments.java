package Payment;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPayments {
    @Test
    public void testCard() {
        Payment card = new CreditCardPayment();
        Assertions.assertEquals(card.pay(40), "Credit card payment is successful");
    }
    @Test
    public void testPayPal() {
        Payment paypal = new PayPalPayment();
        Assertions.assertEquals(paypal.pay(40), "PayPal payment is successful");
    }
}
