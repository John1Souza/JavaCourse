package Challenges;

import java.util.Scanner;

public class ConversionChallenge {
    public static void main(String[] args) {

        // taking the value wrote by the user
        Scanner entry = new Scanner(System.in);

        System.out.print("Write the first wage: ");
        String wageOne = entry.nextLine().replace( ",", ".");

        System.out.print("Write the second wage: ");
        String wageTwo = entry.nextLine().replace( ",", ".");

        System.out.print("Write the third wage: ");
        String wageThree = entry.nextLine().replace( ",", ".");


        Double wageOneConverted = Double.parseDouble(wageOne);
        Double wageTwoConverted = Double.parseDouble(wageTwo);
        Double wageThreeConverted = Double.parseDouble(wageThree);


        System.out.
                printf("the 3 last wage's of the employer are: %.2f, %.2f and %.2f",
                        wageOneConverted,
                        wageTwoConverted,
                        wageThreeConverted);

        double meanOfWages = (wageOneConverted + wageTwoConverted + wageThreeConverted)/3;

        System.out.printf("\nConsidering this, the mean of the wages are: %.2f", meanOfWages);

        entry.close();
    }
}
