package Control;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {
        String value = JOptionPane.showInputDialog(
                "Type the number: ");
        int number = Integer.parseInt(value);
        if(number % 2 == 0){
            System.out.println("Number is pair!");
        } else {
            System.out.println("Number is odd!");
        }
    }
}
