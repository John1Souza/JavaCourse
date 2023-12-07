package ArraysAndCollections;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students? ");
        int qtyOfStudents = input.nextInt();

        System.out.println("How many notes for students? ");
        int qtyOfGrades = input.nextInt();

        double[][] gradesOfTheParty = new double[qtyOfStudents][qtyOfGrades];

        double sumOfTheGrades = 0;
        for(int a = 0; a < gradesOfTheParty.length; a++){
            for(int n = 0; n < gradesOfTheParty[a].length; n++){
                System.out.printf("Tell the grade of %d of the student %d: ", n + 1, a + 1);
                gradesOfTheParty[a][n] = input.nextDouble();
                sumOfTheGrades += gradesOfTheParty[a][n];
            }
        }

        double mean = sumOfTheGrades / (qtyOfStudents * qtyOfGrades);
        System.out.println("Average of party is : " + mean);
        input.close();
    }


}
