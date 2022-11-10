package Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class PayPalPayment implements Payment{
    private int paid;
    @Override
    public String pay() {
        return "PayPal payment is successful";
    }
}
