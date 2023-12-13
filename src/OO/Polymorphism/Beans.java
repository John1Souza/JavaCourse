package OO.Polymorphism;

public class Beans extends Food {
    //private double weight;

    public Beans(double weight) {
        super(weight);
    }

    public void eat(Beans beans){
        beans.getWeight();
    }
    //public double getWeight() {
    //    return weight;
    //}

    //public void setWeight(double weight) {
    //    if(weight >= 0){
    //        this.weight = weight;
    //    }
    //}
}
