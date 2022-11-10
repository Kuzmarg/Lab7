package Delivery;

import Flower.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @Setter @AllArgsConstructor
public class PostDelivery implements Delivery{
    private List<Item> items;
    @Override
    public String deliver() {
        return "Delivered with post successfully";
    }
}
