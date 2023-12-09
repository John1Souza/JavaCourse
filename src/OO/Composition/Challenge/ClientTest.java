package OO.Composition.Challenge;

public class ClientTest {
    public static void main(String[] args) {
        Client theChosenOneClient = new Client("Carlos");

        Purchase purchase01 = new Purchase();
        purchase01.addItems(new Product("Cell", 1250.00), 2);
        purchase01.addItems(new Product("Note", 4250.00), 1);

        Purchase purchase02 = new Purchase();
        purchase02.addItems(new Product("Tv", 1230.00), 1);
        purchase02.addItems(new Product("PS5", 3780.00), 2);

        theChosenOneClient.clientPurchase(purchase01);
        theChosenOneClient.clientPurchase(purchase02);

        for(Purchase purchase: theChosenOneClient.purchases){
            System.out.println("Products: ");
            System.out.println("<==============>");
            for (Item item: purchase.items){
                System.out.println("Product Name => " + item.product.name + " => Product Price => " +
                        item.product.price + " => Product quantity => " +
                        item.quantity);
            }
            System.out.println("<==============>");
        }

        System.out.println("The total amount spent was: R$" + theChosenOneClient.getTotalValue());
    }
}
