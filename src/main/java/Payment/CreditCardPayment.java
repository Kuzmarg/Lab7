package Payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public class CreditCardPayment implements Payment {
    private int paid;
    @Override
    public String pay() {
        return "Credit card payment is successful";
    }
}
