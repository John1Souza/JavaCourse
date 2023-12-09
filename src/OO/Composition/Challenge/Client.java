package OO.Composition.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Client {
    String name;
    List<Purchase> purchases = new ArrayList<>();

    Client(String name){
        this.name = name;
    }
    void clientPurchase(Purchase purchase){
        purchases.add(purchase);
    }

    double getTotalValue(){
        double totalValue = 0;
        for (Purchase purchase: purchases) {
            for (Item item: purchase.items){
                totalValue += item.quantity * item.product.price;
            }
        }
        return totalValue;
    }
}
