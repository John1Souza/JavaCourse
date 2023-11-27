package Challenges;

import java.util.Scanner;

public class ChallengeDayOfWeek {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);


        System.out.println("Sunday | Monday | Tuesday | Wednesday | Thursday | Friday | Saturday");
                System.out.println("\nType the day of week: ");
        String dayOfWeek = entry.next().toUpperCase();

        if (dayOfWeek.equals("SUNDAY")){
            System.out.println("1º day of week!");
        } else if (dayOfWeek.equals("MONDAY")){
            System.out.println("2º day of week!");
        }else if (dayOfWeek.equals("TUESDAY")){
            System.out.println("3º day of week!");
        }else if (dayOfWeek.equals("WEDNESDAY")){
            System.out.println("4º day of week!");
        }else if (dayOfWeek.equals("THURSDAY")){
            System.out.println("5º day of week!");
        }else if (dayOfWeek.equals("FRIDAY")){
            System.out.println("6º day of week!");
        }else if (dayOfWeek.equals("SATURDAY")){
            System.out.println("7º day of week!");
        }else{
            System.out.println("Invalid day of week!");
        }
    }
}
