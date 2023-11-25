package Challenges;

public class ChallengeArithmeticOperators {
	public static void main(String[] args) {
		int a = 3 + 2;
		int b = 6 * a;
		int c = (int) Math.pow(b, 2);
		int d = 3 * 2;
		int e = c / d;
		int f = 1 - 5;
		int g = 2 - 7;
		int h = f * g;
		int i = h / 2;
		int j = (int) Math.pow(i, 2);
		int k = e - j;
		int l = (int)Math.pow(k, 3);
		int m = (int)Math.pow(10, 3);
		int n = l / m;
		
		System.out.println(n);
	}
}
