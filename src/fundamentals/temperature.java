package fundamentals;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        System.out.println("Welcome to the center of temperature conversion!");

        Scanner input = new Scanner(System.in);    //System.in is a standard input stream

        System.out.print("Enter the celsius temperature (°C) here: ");

        double celsius = input.nextInt();

        final double nineFive = 9/5;
        final double fiveNine = 5/9;
        final double thirtyTwo = 32;

        double fahrenheitConversion = ((celsius * nineFive) + thirtyTwo);
        double fahrenheitConversionTwo = ((celsius * nineFive) + thirtyTwo);

        double fahrenheit = fahrenheitConversion;

        System.out.println("The temperature " + celsius + "°C converted into fahrenheit is : "
                + fahrenheit + " °F");
    }
}
