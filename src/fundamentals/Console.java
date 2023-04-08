package fundamentals;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Good");
        System.out.print(" Day!\n");

        System.out.println("Good ");
        System.out.println("Day!");

        System.out.printf("MegaSenna: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
        System.out.printf("Wage: %.1f%n", 1234.5678);
        System.out.printf("Name: %s%n", "John");

        Scanner entry = new Scanner(System.in);


        System.out.print("Write your name: ");
        String name = entry.nextLine();

        System.out.print("Write your last name: ");
        String lastName = entry.nextLine();

        System.out.print("Write your age: ");
        int age = entry.nextInt();

        System.out.printf("%s %s have %d years old.", name, lastName, age);

        entry.close();
    }
}