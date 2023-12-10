package OO.Composition.ProposedExercise.ProposedEx01;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customerOne = new Customer("John");

        Book book1 = new Book("Harry Potter", "J.K. Rowling", 29.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 19.99);

        Order order = customerOne.createOrder();

        order.addItem(book1, 2);
        order.addItem(book2, 1);

        order.calculateTotal();

        for (Order o: customerOne.orders){
            System.out.println("Orders Total: $" + o.total);
        }


    }
}
