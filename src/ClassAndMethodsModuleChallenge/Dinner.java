package ClassAndMethodsModuleChallenge;

public class Dinner {
    public static void main(String[] args) {
        Food sushi = new Food("Japanese Food", 2.250);
        Food spaguette = new Food("Italian food", 3.150);
        // anyFood.foodName = "Japanese Food";
        // anyFood.foodWeight = 2.250;


        People johnDoe = new People("John Doe", 110.00);

        System.out.printf("Before eat, %s have %.2fKg of weight,", johnDoe.name, johnDoe.weight);
        johnDoe.weight = johnDoe.eat(sushi.foodWeight);
        johnDoe.weight = johnDoe.eat(spaguette.foodWeight);


        System.out.printf("\nAfter eat one %s with %.2fKg and %s with %.2fKg, %s have %.2fKg of weight.", sushi.foodName, sushi.foodWeight, spaguette.foodName, spaguette.foodWeight, johnDoe.name, johnDoe.weight);

    }
}
