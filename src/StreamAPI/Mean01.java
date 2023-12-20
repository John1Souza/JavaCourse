package StreamAPI;

public class Mean01 {
    private double total;
    private int quantity;

    public Mean01 toAdd(double value){
        total += value;
        quantity++;
        return this;
    }

    public double getValue(){
        return total/quantity;
    }

    public static Mean01 toCombine(Mean01 m1, Mean01 m2){
        Mean01 result = new Mean01();
        result.total = m1.total + m2.total;
        result.quantity = m1.quantity + m2.quantity;
        return result;

    }

}
