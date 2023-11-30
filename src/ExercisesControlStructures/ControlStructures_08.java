package ExercisesControlStructures;

import java.util.Scanner;

public class ControlStructures_08 {

    public static void main(String[] args) {
        // 8. Criar um programa que receba uma palavra e imprime no console letra por letra.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string here: ");
        String newWord = input.next();

//        String[] wordSplitted =  newWord.split(" ");
//
//        System.out.println(wordSplitted);
        System.out.println(newWord.length());
        for (int i = 0; i < newWord.length(); i++){
            System.out.println(newWord.toCharArray()[i]);
        }
        input.close();

    }

}
