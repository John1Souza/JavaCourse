package OO.Composition.ProposedExercise;

import java.util.ArrayList;

public class Order {

    double total;
    ArrayList<OrderItem> orderItems = new ArrayList<>();

    void addItem(Book book, int quantity){
        OrderItem orderItem = new OrderItem(book, quantity);
        orderItems.add(orderItem);
    }
    void calculateTotal(){
        total = 0;
        for(OrderItem item: orderItems){
            total += item.book.price * item.quantity;
        }
    }

//    public double getTotal(){
//        return total;
//    }
}
