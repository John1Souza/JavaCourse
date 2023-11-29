package Loops;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = "Please";

        do{
            System.out.println("You need to speak the magic words...");
            System.out.println("Want to exit?");
            text = input.nextLine();
        }while(!text.equalsIgnoreCase("Please"));

        System.out.println("Thank You!");
        input.close();
    }
}
