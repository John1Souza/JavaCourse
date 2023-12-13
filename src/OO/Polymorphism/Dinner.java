package OO.Polymorphism;

public class Dinner {
    public static void main(String[] args) {
        People guest = new People(99.65);

        Food ingredients01 = new Rice(0.200);
        Food ingredients02 = new Beans(0.100);

        Food dessert = new Icecream(0.4);

        System.out.println(guest.getWeight());

        guest.peopleEats(ingredients01);
        guest.peopleEats(ingredients02);
        guest.peopleEats(dessert);

        System.out.println(guest.getWeight());
    }
}
