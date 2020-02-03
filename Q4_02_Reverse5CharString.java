package JavaInterviewQnA;

public class Q4_02_Reverse5CharString {

//	4_02 Write a method that will reverse a string  only 5 characters long.
//		 If word is shorter, display message: "Too short!". 
//		 If word is longer, display message: "Too long!". 

	public static void main(String[] args) {
		String str1 = "menemen";
		String str2 = "ezme";
		String str3 = "recel";
		
		reverseFiveChar(str1);
		reverseFiveChar(str2);
		reverseFiveChar(str3);
	}

	public static void reverseFiveChar(String str) {
		String strNew = "";
		 if (str.length() < 5) {
			System.out.println("Too short");
			return;
		} if (str.length() > 5){
			System.out.println("Too long");
			return;
		}
		for (int i = str.length() - 1; i >= 0; i--) {
				strNew += str.charAt(i);
		}
		System.out.println(strNew);
	}
}
