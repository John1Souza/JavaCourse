package fundamentals;

import javax.swing.*;

public class ConversionStringNumber {
    public static void main(String[] args) {

        String value1 = JOptionPane
                .showInputDialog("Write the first number: ");

        String value2 = JOptionPane
                .showInputDialog("Write the second number: ");

        System.out.println(value1 + value2);

        double number1 = Double.parseDouble(value1);
        double number2 = Double.parseDouble(value2);

        double sum = number1 + number2;
        double mean = number1 / number2;
        System.out.printf("%.2f + %.2f = %.2f", number1, number2, sum);
        System.out
                .printf("\nThe Mean of the numbers %.2f and %.2f is equal to: %.2f",
                number1, number2, mean);
    }
}
