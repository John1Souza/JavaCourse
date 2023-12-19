package StreamAPI.FilterChallenge;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FIlterChallenge {
    public static void main(String[] args) {
        Cars car1 = new Cars("Honda Civic", "White", "medium sedan", 115500.50, false);
        Cars car2 = new Cars("Honda Accord", "Black", "large sedan", 155000.00, false);
        Cars car3 = new Cars("Honda City", "Pink", "small sedan", 105500.00, true);
        Cars car4 = new Cars("Toyota Camri", "White", "large sedan", 165000.00, true);
        Cars car5 = new Cars("Toyota Corolla", "black", "medium sedan", 145000.50, true);
        Cars car6 = new Cars("VW Passat CC", "White", "large sedan", 95000.50, false);
        Cars car7 = new Cars("VW Jetta", "orange", "medium sedan", 105800.50, false);
        Cars car8 = new Cars("VW Golf", "White", "hatch", 110500.50, false);

        List<Cars> carsList = Arrays.asList(car1, car2, car3, car4, car5, car6, car7, car8);

        Client c1 = new Client("John", 200000, "medium sedan", "White");
        Client c2 = new Client("Gui", 150000, "large sedan", "Black");
        Client c3 = new Client("Bia", 180000, "small sedan", "Black");
        Client c4 = new Client("Lia", 190000, "large sedan", "White");
        Client c5 = new Client("Joy", 150000, "medium sedan", "Black");
        Client c6 = new Client("Harry", 90000, "small sedan", "White");
        Client c7 = new Client("Larry", 250000, "small sedan", "Black");
        Client c8 = new Client("Barry", 350000, "hatch", "White");
        Client c9 = new Client("Peter", 400000, "hatch", "White");
        Client c10 = new Client("Herald", 10000, "hatch", "White");

        List<Client> clientList = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

        Predicate<Client> clientOrder1 = a -> a.carTypePreference.equals("medium sedan");
        Predicate<Client> clientOrder2 = a -> a.carTypePreference.equals("large sedan");
        Predicate<Client> clientOrder3 = a -> a.carTypePreference.equals("small sedan");
        Predicate<Client> clientOrder4 = a -> a.carTypePreference.equals("hatch");

        Predicate<Cars> cars1 = a -> a.type.equals("medium sedan");
        Predicate<Cars> cars2 = a -> a.type.equals("large sedan");
        Predicate<Cars> cars3 = a -> a.type.equals("small sedan");
        Predicate<Cars> cars4 = a -> a.type.equals("hatch");



        Function<Client, String> order1 =
                a -> "Good, " + a.name + " whant's a " + a.carTypePreference;

        Function<Cars, String> orderOptions =
                a -> "for " + a.type + " we have these cars: " + a.name;

        clientList.stream()
                .filter(clientOrder1)
                .map(order1)
                .forEach(System.out::println);

        clientList.stream()
                        .filter(clientOrder2)
                        .map(order1)
                        .forEach(System.out::println);
        clientList.stream()
                        .filter(clientOrder3)
                        .map(order1)
                        .forEach(System.out::println);
        clientList.stream()
                        .filter(clientOrder4)
                        .map(order1)
                        .forEach(System.out::println);

        carsList.stream()
                .filter(cars1)
                .map(orderOptions)
                .forEach(System.out::println);
        carsList.stream()
                .filter(cars2)
                .map(orderOptions)
                .forEach(System.out::println);
        carsList.stream()
                .filter(cars3)
                .map(orderOptions)
                .forEach(System.out::println);
        carsList.stream()
                .filter(cars4)
                .map(orderOptions)
                .forEach(System.out::println);


    }
}
