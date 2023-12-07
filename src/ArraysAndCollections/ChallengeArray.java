package ArraysAndCollections;

import java.util.Arrays;
import java.util.Scanner;

public class ChallengeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("how many grades do you want to enter: ");
        int qtdOfGrades = input.nextInt();

        double[] grades = new double[qtdOfGrades];

        for(int i = 0; i < grades.length; i++){
            System.out.printf("Type the %d grade: ", i+1);
            double gradesOfStudents = input.nextDouble();
            grades[i] = gradesOfStudents;
        }

        System.out.println(Arrays.toString(grades));

        double sumOfGrades = 0;
        for(double sumOfGradesFor: grades){
            sumOfGrades += sumOfGradesFor;
        }

        System.out.printf("The sum of all grades is %.2f.",
                sumOfGrades);
        System.out.printf("\nThe average of all grades is %.2f.",
                (sumOfGrades / grades.length));
        input.close();
    }
}
