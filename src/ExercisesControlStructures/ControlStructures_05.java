package ExercisesControlStructures;

import java.util.Scanner;

public class ControlStructures_05 {

    public static void main(String[] args) {
        // 5. Refatorar o exercício 04, utilizando a estrutura switch.
        Scanner input = new Scanner(System.in);

        System.out.println("Type the number: ");
        int primeNumber = input.nextInt();
        int count = 0;

        for(int i = 1; i <= primeNumber; i++){
            if(primeNumber % i == 0){
                count++;
            }
            //System.out.println(primeNumber/i);
        }
        if(count == 2){
            System.out.printf("%d is a prime number!", primeNumber);

        }else{
            System.out.printf("%d isn't a prime number!", primeNumber);
        }

        switch (count){
            case 2:
                System.out.printf("%d is a prime number!", primeNumber);
            case 1:
                System.out.printf("%d isn't a prime number!", primeNumber);
            default:
                System.out.println("Invalid!");
        }

        input.close();
    }

}
