package OO.Composition.Challenge;

import java.util.ArrayList;

public class Purchase {
    ArrayList<Item> items = new ArrayList<>();
    void addItems(Product product, int quantity){
        Item item = new Item(product, quantity);
        items.add(item);
    }

}
