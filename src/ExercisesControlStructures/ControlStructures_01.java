package ExercisesControlStructures;

import java.util.Scanner;

public class ControlStructures_01 {

    public static void main(String[] args) {
        // Create a program that receives a number and checks if it is between 0 and 10 and is even.

        Scanner input = new Scanner(System.in);
        System.out.println("Type any number here: ");
        int number = input.nextInt();

        if(number >= 0 && number <= 10 && number % 2 == 0){
            System.out.printf("%d is between 0 and 10 and is even.", number);
        }else if (number >= 0 && number <= 10 && number % 2 != 0){
            System.out.printf("%d is between 0 and 10 and is not even.", number);
        }else{
            System.out.printf("%d isn't between 0 and 10.", number);
        }

        input.close();
    }

}
