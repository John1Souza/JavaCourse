package ClassesAndMethods;

public class ProductMethod {

    String name;
    double price;
    double discount;

    ProductMethod(String initialName, double productPrice, double storeDiscount){
        name = initialName;
        price = productPrice;
        discount = storeDiscount;
    }

    ProductMethod(){

    }
    double priceWithDiscount (){
        return price * (1 - discount);
    }

    double priceWithDiscount(double managerDiscount){
        return price * (1 - discount + managerDiscount);
    }
}
