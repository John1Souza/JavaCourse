package ClassesAndMethods;

public class ProductMethod {

    String name;
    double price;
    double discount;

    double priceWithDiscount (){
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount){
        return price * (1 - discount + managerDiscount);
    }
}
