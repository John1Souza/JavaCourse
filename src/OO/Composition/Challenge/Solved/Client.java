package OO.Composition.Challenge.Solved;

import java.util.ArrayList;
import java.util.List;

public class Client {
    final String name;
    final List<Purchase> purchaseList = new ArrayList<>();

    Client(String name){
        this.name = name;
    }

    void addPurchase(Purchase purchase){
        this.purchaseList.add(purchase);
    }

    double getTotalValue(){
        double total = 0;
        for(Purchase purchase: purchaseList){
            total += purchase.getTotalValue();
        }
        return total;
    }
}
