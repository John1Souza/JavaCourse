package ExercisesControlStructures;
import java.util.Scanner;
public class ControlStructures_09 {

    public static void main(String[] args) {
        // 9. Crie um programa que recebe 10 valores e ao final imprima o maior número

        Scanner input = new Scanner(System.in);

        int number = 0;
        int maior = 0;
        int menor = 0;
        for (int i = 1; i <= 10; i++){
            System.out.printf("Type the %dª number here: ", i);
            number = input.nextInt();

            if(i == 1){
                maior = number;
                menor = number;
            }else {
                if (number > maior) {
                    maior = number;
                }
                if (number < menor) {
                    menor = number;
                }
            }

        }
        System.out.printf("the largest and smallest values are respectively: %d and %d", maior, menor);
        input.close();

    }

}
