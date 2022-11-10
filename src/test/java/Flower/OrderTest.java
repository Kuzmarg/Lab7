package Flower;

import Delivery.DHLDelivery;
import Payment.CreditCardPayment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {
    private Order order;
    @BeforeEach
    public void init() {
        List<Item> items = new ArrayList<>();
        items.add(new RomashkaFLower());
        items.add(new CactusFlower());
        order = new Order(items);
    }

    @Test
    public void testAddItemAndGetTotalPrice() {
        Flower flower = new Flower(15, "Description");
        order.addItem(flower);
        Assertions.assertEquals(order.calculateTotalPrice(), 65);
    }

    @Test
    public void testDeleteItem() {
        RomashkaFLower romashkaFLower = new RomashkaFLower();
        order.deleteItem(romashkaFLower);
        Assertions.assertEquals(order.calculateTotalPrice(), 20);
    }

    @Test
    public void testProcessOrder() {
        order.setDelivery(new DHLDelivery(new ArrayList<Item>()));
        order.setPayment(new CreditCardPayment(50));
        Assertions.assertEquals(order.processOrder(50), "Payment is successful");
        order.setPayment(new CreditCardPayment(40));
        Assertions.assertEquals(order.processOrder(40), "Payment is not enough");
        order.setPayment(new CreditCardPayment(60));
        Assertions.assertEquals(order.processOrder(60), "Payment is successful. The rest is 10.0");
    }
}
