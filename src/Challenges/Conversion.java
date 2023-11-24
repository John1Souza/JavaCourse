package Challenges;

import java.util.Scanner;

public class Conversion {
	public static void main(String[] args) {
		Scanner wage = new Scanner(System.in);
		
		System.out.println("Writte the first salary: "); 
		Double wageOne = Double.parseDouble(wage.next().replace(",", "."));
		
		System.out.println("Writte the second salary: "); 
		Double wageTwo = Double.parseDouble(wage.next().replace(",", "."));
		
		System.out.println("Writte the last salary: "); 
		Double wageThree = Double.parseDouble(wage.next().replace(",", "."));
		
		Double mean = (wageOne + wageTwo + wageThree)/3;
		
		System.out.printf("The average salary $%.2f, $%.2f and $%.2f, is : $%.2f", wageOne, wageTwo, wageThree, mean);
		
		
		
		wage.close();
	}
}
