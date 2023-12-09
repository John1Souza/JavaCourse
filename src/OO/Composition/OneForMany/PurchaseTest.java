package OO.Composition.OneForMany;

public class PurchaseTest {
    public static void main(String[] args) {
        Purchase purchase1 = new Purchase();
        purchase1.client = "John Doe";

        purchase1.addItem("Pen", 20, 7.45);
        purchase1.addItem(new Item("Erase", 12, 3.89));
        purchase1.addItem(new Item("Journal", 3, 18.79));

        System.out.println(purchase1.items.size());

        System.out.println(purchase1.getFullValue());

        System.out.println(purchase1.items.get(0).
                purchase.items.get(1).
                purchase.getFullValue());


    }
}
