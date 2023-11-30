package ExercisesControlStructures;

import java.util.Scanner;

public class ControlStructures_07 {

    public static void main(String[] args) {
        //7. Criar um programa que enquanto estiver recebendo números positivos,
        // imprime no console a soma dos números inseridos, caso receba um número negativo,
        // encerre o programa. Tente utilizar a estrutura do while.
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number = 0;
        do{
            System.out.print("Type any number here: ");
            number = input.nextInt();
            if(number >= 0) {
                sum += number;
            }
        }while(number > 0);

        System.out.println(sum);
        input.close();

    }

}
