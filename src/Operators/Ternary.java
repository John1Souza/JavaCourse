package Operators;

public class Ternary {
	public static void main(String[] args) {
		double mean = 8.6;
		String finalResult = mean >= 7.0 ? "Aproved." : "in recovery.";
		System.out.println("The student is " + finalResult);
		
		double nota = 9.9;
		boolean goodFella = true;
		boolean passedByAverage = nota >= 7;
		boolean withDiscount = goodFella && passedByAverage;
		String result = withDiscount ? "Yes." : "Not.";
		
		System.out.printf("Have discount? %s", result);
	}
}
