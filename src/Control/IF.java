package Control;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);

        System.out.println("Type the median: ");
        double mean = entry.nextDouble();
        if (mean <= 10 && mean >= 7.0){
            System.out.println("Approved!");
            System.out.println("Congratulations!");
        }
        if (mean < 7 && mean >= 4.5){
            System.out.println("Recuperation!");
        }

        boolean criterionFailureReached = mean < 4.5 && mean >= 0;
        if(criterionFailureReached){
            System.out.println("Disapproved!");
        }

        entry.close();
    }
}
