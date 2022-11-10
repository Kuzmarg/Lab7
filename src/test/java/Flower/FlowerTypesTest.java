package Flower;

import Flower.Flower;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FlowerTypesTest {
    public static final int ROMASHKAFLOWERPRICE = 30;
    public static final int CACTUSFLOWERPRICE = 20;
    private Flower flower;

    @Test
    public void romashkaFlowerTest() {
        flower = new RomashkaFLower();
        Assertions.assertEquals(flower.getPrice(), ROMASHKAFLOWERPRICE);
    }

    @Test
    public void cactusFlowerTest() {
        flower = new CactusFlower();
        Assertions.assertEquals(flower.getPrice(), CACTUSFLOWERPRICE);
    }
}
