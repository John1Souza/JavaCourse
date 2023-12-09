package OO.Composition.Challenge;

public class Item {
    int quantity;

    Product product;
    Item(Product product, int quantity){
        this.quantity = quantity;
        this.product = product;
    }

}
