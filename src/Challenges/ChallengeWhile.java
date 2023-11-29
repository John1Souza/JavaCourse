package Challenges;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ChallengeWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //!exit.equalsIgnoreCase("-1"

        double note = 0;
        int cont = 0;
        double sum = 0.00;
        while (note != -1) {
            System.out.println("Type the note (Only notes in range 0 - 10 is allowed) or type [-1] to exit: ");
            note = input.nextDouble();
            if (note == -1) break;
            else if (note < 0 || note > 10) {
                System.out.println("Invalid note, please verify if is correct!");
            } else {
                sum += note;
                cont++;
            }

        }
        System.out.printf("the average of the grades entered was: %.2f", (sum/cont));

    }
}
