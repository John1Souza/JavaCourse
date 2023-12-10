package OO.Composition.ProposedExercise.ProposedEx01;

import java.util.ArrayList;

public class Customer {
    String name;

    ArrayList<Order> orders = new ArrayList<>();

    Customer(String name){
        this.name = name;
    }
//    void createOrder(Book book, int quantity){
//        Order order = new Order();
//        order.addItem(book, quantity);
//        orders.add(order);
//    }
    Order createOrder(){
        Order order = new Order();
        orders.add(order);
        return order;
    }
}
