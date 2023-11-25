package Operators;

public class Logical {
	public static void main(String[] args) {
		boolean conditionOne = true;
		boolean conditionTwo = 3 > 7;
		
		System.out.println(conditionOne && conditionTwo);
		System.out.println(conditionOne || conditionTwo);
		System.out.println(conditionOne ^ conditionTwo);
		System.out.println(!!conditionOne);
		System.out.println(!conditionOne);
		
		
		System.out.println("True Table & (AND)");
		System.out.println(true &&  true);
		System.out.println(true &&  false);
		System.out.println(false &&  true); // Dead Code
		System.out.println(false &&  false); // Dead Code
		
		System.out.println("\nTrue table OU / || (OR)");
		System.out.println(true || true); // Dead Code
		System.out.println(true || false); // Dead Code 
		System.out.println(false || true);
		System.out.println(false || false);
		
		
		System.out.println("\nTrue table Exclusive OR / ^ (XOR) ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTrue table NOT / !");
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(false ^ false);
		
		
		
	}
}
