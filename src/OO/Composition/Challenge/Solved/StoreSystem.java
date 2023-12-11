package OO.Composition.Challenge.Solved;

public class StoreSystem {
    public static void main(String[] args) {

        Purchase purchase1 = new Purchase();
        purchase1.addItem("Pen", 1, 100);
        purchase1.addItem(new Product("Notebook", 2000), 2);

        Purchase purchase2 = new Purchase();
        purchase2.addItem("Notepad", 10, 10);
        purchase2.addItem(new Product("Printer", 1000), 1);


        Client client = new Client("John Doe");
        client.addPurchase(purchase1);
        //client.purchaseList.add(purchase1);
        client.purchaseList.add(purchase2);

        System.out.println(client.getTotalValue());
    }
}
