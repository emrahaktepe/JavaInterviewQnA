package JavaInterviewQnA;

public class Q5_02 {

//	5_02 A sandwich is two pieces of bread with something in between. Print the 
//		 string that is between the first and last appearance of "bread" in the
//		 given string, or return string "nothing" if there are not two pieces of bread.

	public static void main(String[] args) {
		
		String sandwich = "bread pickle lettuce olives ketchup onions bread";
		String noSandwich = "pickle lettuce bread olives ketchup onions";
		
		sandwich(sandwich);
		sandwich(noSandwich);

	}
	
	public static void sandwich(String str) {
		int firstBread = str.indexOf("bread");
		int lastBread = str.lastIndexOf("bread");
		if( firstBread == lastBread){
				System.out.println("nothing");
				return;
			}
		for(int i = firstBread+5; i < lastBread; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

	}
}
// ***************************************************************