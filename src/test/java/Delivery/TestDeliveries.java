package Delivery;

import Flower.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TestDeliveries {
    @Test
    public void testDHL() {
        Delivery dhl = new DHLDelivery(new ArrayList<Item>());
        Assertions.assertEquals(dhl.deliver(), "Delivered with DHL successfully");
    }
    @Test
    public void testPost() {
        Delivery post = new PostDelivery(new ArrayList<Item>());
        Assertions.assertEquals(post.deliver(), "Delivered with post successfully");
    }
}
