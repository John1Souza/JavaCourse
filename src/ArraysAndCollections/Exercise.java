package ArraysAndCollections;

import java.util.Arrays;

public class Exercise {
    public static void main(String[] args) {
        double[] noteStudentA = new double[4];
        noteStudentA[0] = 7.9;
        noteStudentA[1] = 8;
        noteStudentA[2] = 6.7;
        noteStudentA[3] = 9.7;

        System.out.println(Arrays.toString(noteStudentA));

        double tot = 0;
        for(int i = 0; i < noteStudentA.length; i++){
            tot += noteStudentA[i];
        }
        System.out.println(tot / noteStudentA.length);

        double[] noteStudentB = {6.9, 8.9, 5.5, 10};
        double totB = 0;
        for(int i = 0; i < noteStudentB.length; i++) {
            totB += noteStudentB[i];
        }

        System.out.println(totB / noteStudentB.length);
    }
}
