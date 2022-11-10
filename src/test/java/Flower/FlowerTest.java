package Flower;

import Flower.Flower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerTest {
    public static final int CHECKPRICE = 20;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower(CHECKPRICE, "Description");
    }

    @Test
    public void testPrice() {
        int price = CHECKPRICE;
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }
}