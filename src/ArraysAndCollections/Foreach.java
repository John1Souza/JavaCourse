package ArraysAndCollections;

public class Foreach {
    public static void main(String[] args) {
        double[] note = {9.9, 8.7, 7.2, 9.4};

        for(int i = 0; i < note.length; i++){
            System.out.println(note[i] + " ");
        }

        System.out.println();
        for (double noteA: note) {
            System.out.println(noteA + " ");
        }
    }
}
