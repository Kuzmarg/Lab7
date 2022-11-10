package Flower;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {

    private List<Flower> flowers = new ArrayList<>();

    public void add(Flower flower) {
        flowers.add(flower);
    }
    public double getPrice() {
        double price = 0;
        for (Flower flower: flowers) {
            price += flower.getPrice();
        }
        return price;
    }
    public boolean searchFlower(Flower flower) {
        for (Flower flower1: flowers) {
            if(flower1.equals(flower)) {
                return true;
            }
        }
        return false;
    }
}
