package Control;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Enter the note: ");
        double note = entry.nextDouble();

        if(note > 10 || note < 0){
            System.out.println("Invalid note");
        } else if (note >= 8.1) {
            System.out.println("A concept!");
        }else if (note >= 6.1) {
            System.out.println("B concept!");
        }else if (note >= 4.1) {
            System.out.println("C concept!");
        }else if (note >= 2.1) {
            System.out.println("D concept!");
        } else {
            System.out.println("E concept!");
        }

        System.out.println("End!");
        entry.close();
    }
}
