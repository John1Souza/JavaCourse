package Operators;

public class Relational {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		double nota = 7.3;
		boolean goodFella = true;
		boolean passedByAverage = nota >= 7;
		boolean withDiscount = goodFella && passedByAverage;
		
		System.out.println("Have discount? " + withDiscount);
	}
}
