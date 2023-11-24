package Challenges;

import java.util.Scanner;

public class VariableAndConstant {
	public static void main(String[] args) {
		// (ºF -32) x 5/9 = ºC
		
		Scanner tempInFahrenheit = new Scanner(System.in);
		
		final double adjust = 32;
		final Double factor = 5.0/9.0;
		
		
		System.out.println("Please, insert the ºF temperature for conversion: ");
		var fahrenheit = Double.parseDouble(tempInFahrenheit.next());
		var celsius = (Double)((fahrenheit - adjust)*(factor));
		
		System.out.printf("%.2fºF temperature converted to ºC, is %.2fºC", fahrenheit, celsius);
		
		tempInFahrenheit.close();
	}
}
