package Exception;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {

            System.out.println(7 / input.nextInt());


        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }finally {
            System.out.println("Finally...#01");
        }

        try {

            System.out.println(7 / input.nextInt());
        }finally {
            System.out.println("Finally...#02");
            input.close();
        }

        System.out.println("End :)");
    }
}
