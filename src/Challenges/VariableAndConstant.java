package Challenges;

import java.util.Scanner;

public class VariableAndConstant {
	public static void main(String[] args) {
		// (ºF -32) x 5/9 = ºC
		
		Scanner tempInFahrenheit = new Scanner(System.in);
		
		final int thirtyTwo = 32;
		final Double five = 5.0;
		final Double nine = 9.0;
		
		System.out.println("Please, insert the ºF temperature for conversion: ");
		var fahrenheit = Double.parseDouble(tempInFahrenheit.next());
		var celsius = (Double)((fahrenheit - thirtyTwo)*(five/nine));
		
		System.out.printf("The %.4fºF temperature converted to ºC, is %.4fºC", fahrenheit, celsius);
		
		tempInFahrenheit.close();
	}
}
