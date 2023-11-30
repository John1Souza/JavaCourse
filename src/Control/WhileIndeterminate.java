package Control;

import java.util.Scanner;

public class WhileIndeterminate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String value = "";
        while(!value.equalsIgnoreCase("sair")){
            System.out.println("You say: ");
            value = input.nextLine();
        }

        input.close();
    }
}
