package Challenges;

public class ChallengeLogicalOperators {
	public static void main(String[] args) {
		// Job on Tuesday / Trabalho na terça ( V ou F )
		// Job on Thursday / Trabalho na quinta ( V ou F )
		
		// If ( jobOnTuesday == true && jobOnThursday == true){
		//		return System.out.println("New TV of 50" on weekend, and ice cream" );
		// }else if( jobOnTuesday == true || jobOnThursday == true ){
		//		return System.out.println("New TV of 32" on weekend, and ice cream");
		// }else {
		// 		return System.out.println("Not New TV and ice cream  on weekend");
		// }
		
		
		boolean jobOnTuesday = false;
		boolean jobOnThursday = false;
		
		boolean buyTv50 = jobOnTuesday && jobOnThursday;
		boolean buyTv32 = jobOnTuesday ^ jobOnThursday;
		boolean buyTvAndIceCream = jobOnTuesday || jobOnThursday;
		boolean wontBuyTvAndIceCream = !buyTvAndIceCream;
		
		System.out.printf("We are going to buy an 50\" TV ? %b ", buyTv50);
		System.out.printf("\nWe are going to buy an 32\" TV? %b", buyTv32);
		System.out.printf("\nWe are going to buy Ice Cream? %b", buyTvAndIceCream);
		System.out.printf("\nWe aren't going to buy any TV or IceCream ? %b ", wontBuyTvAndIceCream);
		
		
	}
}
