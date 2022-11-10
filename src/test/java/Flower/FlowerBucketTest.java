package Flower;

import Flower.Flower;
import Flower.FlowerBucket;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlowerBucketTest {
    private static final int CHECKPRICE = 20;
    private static final int CHECKTOTALPRICE = 50;
    private FlowerBucket flowerBucket;
    @BeforeEach
    public void init() {
        Flower flower1 = new CactusFlower();
        Flower flower2 = new RomashkaFLower();
        flowerBucket = new FlowerBucket();
        flowerBucket.add(flower1);
        flowerBucket.add(flower2);
    }

    @Test
    public void testPrice() {
        Assertions.assertEquals(CHECKTOTALPRICE, flowerBucket.getPrice());
    }

    @Test
    public void flowerSearchTest() {
        Flower flower = new Flower(CHECKPRICE, "Description");
        Assertions.assertEquals(flowerBucket.searchFlower(flower), false);
    }

}
