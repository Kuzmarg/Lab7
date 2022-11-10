package Flower;

import Delivery.Delivery;
import Payment.Payment;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
public class Order {
    private List<Item> items;
    @Setter
    private Delivery delivery;
    @Setter
    private Payment payment;

    public Order(List<Item> items) {
        this.items = items;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for(Item item: items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public String processOrder(double paid) {
        if (Double.compare(paid, calculateTotalPrice()) == 0) {
            payment.pay();
            delivery.deliver();
            return "Payment is successful";
        }
        else if (Double.compare(paid, calculateTotalPrice()) < 0) {
            return "Payment is not enough";
        }
        else {
            payment.pay();
            delivery.deliver();
            return "Payment is successful. The rest is " + Double.toString(paid - calculateTotalPrice());
        }
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void deleteItem(Item item) {
        items.remove(item);
    }
}
