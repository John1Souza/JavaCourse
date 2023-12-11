package OO.Composition.Challenge.Solved;

import java.util.ArrayList;
import java.util.List;

public class Purchase {

    final List<Item> items = new ArrayList<>();

    void addItem(Product p, int qty){
        this.items.add(new Item(p, qty));
    }
    void addItem(String name, double price , int qty){
        var product = new Product(name, price);
        this.items.add(new Item(product, qty));
    }

    double getTotalValue(){
        double total = 0;
        for(Item item: items){
            total += item.quantity * item.product.price;
        }
        return total;
    }
}
