package ExercisesControlStructures;

import java.util.Scanner;

public class ControlStructures_06 {

    public static void main(String[] args) {
        //6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100.
        // Armazene um numero aleatório em uma variável.
        // O Jogador tem 10 tentativas para adivinhar o número gerado.
        // Ao final de cada tentativa, imprima a quantidade de tentativas restantes,
        // e imprima se o número inserido é maior ou menor do que o número armazenado.
        Scanner input = new Scanner(System.in);


        System.out.println("Guessing game: Try to guess a number between 0 - 100");
        int anyNumber = (int) (Math.random()*101);
        System.out.println(anyNumber);

        int playerAttempt = 0;

        for(int i = 10; i > 0; i--){
            System.out.printf("You have %d attempts left, ", i);
            System.out.print("C'mon, let's try it: ");
            playerAttempt = input.nextInt();
            if (playerAttempt == anyNumber) {
                System.out.println("Congratulations you got it right!!!");
                i = 0;
            }else if (playerAttempt > anyNumber){
                System.out.println("the number entered is greater than the number stored...");
            }else if (playerAttempt < anyNumber){
                System.out.println("the number entered is less than the number stored");
            }else if (i == 1){
                System.out.println("Attempts are over!!");
            }


        }

        input.close();
    }

}
