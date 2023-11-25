package Challenges;

import javax.swing.*;

public class ChallengeCalculator {
    public static void main(String[] args) {
        var firstValue = JOptionPane.showInputDialog("Write the first number: ");
        var secondValue = JOptionPane.showInputDialog("Write the second number: ");

        int valueOne = Integer.parseInt(firstValue);
        int valueTwo = Integer.parseInt(secondValue);

        var outputOpts = JOptionPane
                .showInputDialog("What type of mathematic operations you want to do: " +
                        "\nSum -> [ + ] \nmultiplication -> [ * ]" +
                        "\nsubtraction -> [ - ] \ndivision -> [ / ] ");

        var output = outputOpts.equals("+") ? valueOne + valueTwo : (outputOpts.equals("-") ? valueOne - valueTwo : (outputOpts.equals("*") ? valueOne * valueTwo : (valueOne / valueTwo)));

        JOptionPane.showMessageDialog(null, "Here's the answer for your math question: " + output);
    }
}
