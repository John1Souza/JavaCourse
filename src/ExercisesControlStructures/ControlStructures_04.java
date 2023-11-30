package ExercisesControlStructures;

import java.util.Scanner;

public class ControlStructures_04 {

    public static void main(String[] args) {
        // 4. Criar um programa que receba um número e diga se ele é um número primo.

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



        input.close();
    }

}
