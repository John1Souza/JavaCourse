package OO.Composition.OneForMany;

import java.util.ArrayList;

public class Purchase {
    String client;
    ArrayList<Item> items = new ArrayList<>();

    void addItem(String name, int quantity, double price){
        this.addItem(new Item(name, quantity, price));
    }

    void addItem(Item item){
        items.add(item);
        item.purchase = this;
    }
    double getFullValue(){
        double total = 0;
        for(Item items: items){
            total += items.quantity * items.price;
        }
        return total;
    }

}
