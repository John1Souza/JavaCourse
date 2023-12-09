package OO.Composition.OneForMany;

public class Item {
    String name;
    int quantity;
    double price;
    Purchase purchase;

    Item(String name, int quantity, double price){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
