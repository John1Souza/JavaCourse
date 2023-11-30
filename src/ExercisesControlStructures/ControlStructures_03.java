package ExercisesControlStructures;

import java.time.YearMonth;
import java.util.Scanner;
public class ControlStructures_03 {

    public static void main(String[] args) {
        // 3. Criar um programa que receba duas notas parciais, calcular a média final.
        // Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado",
        // se a nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperação",
        // caso contrário imprime no console "Reprovado".

        Scanner input = new Scanner(System.in);

        System.out.println("Type the first note: ");
        double noteOne = input.nextDouble();

        System.out.println("Type the second note: ");
        double noteTwo = input.nextDouble();

        double mean = (noteOne + noteTwo)/2;

        System.out.printf("Your mean is %f", mean);
        System.out.println("\nYou is: ");
        if(mean >= 7.0){
            System.out.println("Approved!!!");
        }else if(mean <= 7.0 && mean >= 4.0){
            System.out.println("Recovery!");
        }else{
            System.out.println("Disapproved!");
        }
        input.close();
    }

}
