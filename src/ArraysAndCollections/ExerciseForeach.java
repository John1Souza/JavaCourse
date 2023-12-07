package ArraysAndCollections;

import java.util.Arrays;

//import java.util.Scanner;
public class ExerciseForeach {


    public static void main(String[] args) {
        double[] noteStudentA = new double[4];
        System.out.println(Arrays.toString(noteStudentA));

        noteStudentA[0] = 7.9;
        noteStudentA[1] = 6.9;
        noteStudentA[2] = 8.9;
        noteStudentA[3] = 9.9;

        System.out.println(Arrays.toString(noteStudentA));
        System.out.println(noteStudentA[0]);
        System.out.println(noteStudentA[noteStudentA.length-1]);
        //System.out.println(noteStudentA[4]);

        double sumStudentA = 0;
        //for (int i = 0; i < noteStudentA.length; i++) {
        //    sumStudentA += noteStudentA[i];
        //}
        for (double student : noteStudentA) {
            sumStudentA += student;
        }

        System.out.println("the average of the Student A is: " +
                (sumStudentA / noteStudentA.length));

        final double storedNote = 5.9;
        double[] noteStudentB = { 6.9, 8.9, storedNote, 10 };

        double sumStudentB = 0;
        //for (int i = 0; i < noteStudentB.length; i++) {
        //    sumStudentB += noteStudentB[i];
        //}

        for(double student : noteStudentB){
            sumStudentB += student;
        }
        System.out.println("the average of the Student B is: " +
                (sumStudentB / noteStudentB.length));
    }

}
