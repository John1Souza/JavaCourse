package ClassAndMethodsModuleChallenge;

public class People {
    String name;
    double weight;


    People(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    double eat(double foodWeight){

        return this.weight + foodWeight;
    }


}
