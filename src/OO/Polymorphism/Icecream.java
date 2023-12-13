package OO.Polymorphism;

public class Icecream extends Food {
    //private double weight; Como as classes herdam de comida, apenas comida precisa ter os métodos

    public Icecream(double weight){
        super(weight);
    }

    //public void eat(Icecream icecream){
    //    icecream.getWeight();
    //}
    //public double getWeight() {
    //    return weight;
    //}

    //public void setWeight(double weight) {
    //    if(weight >= 0){
    //        this.weight = weight;
    //    }
    //}
}
