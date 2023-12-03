package Challenges;

public class ProductClassVSInstance {

    String name;
    double price;
    static double discount = 0.25;

    ProductClassVSInstance(String initialName, double productPrice){
        name = initialName;
        price = productPrice;
    }

    ProductClassVSInstance(){

    }
    double priceWithDiscount (){
        return price * (1 - discount);
    }

    //double priceWithDiscount(double managerDiscount){
    //    return price * (1 - (discount + managerDiscount));
    //}
}
