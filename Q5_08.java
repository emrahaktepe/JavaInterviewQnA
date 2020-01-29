package JavaInterviewQnA;

public class Q5_08 {

//	5_08 Print out the number of times that "code" appears anywhere in the given string.
//		 Accept any letter for the 'd', so "cope", "core" and "cooe" count.
//	 	 

	public static void main(String[] args) {
		String str = "code cooe core come cone cose coke";
		
		codeCount(str);
	}
	
	public static void codeCount(String str) {
		str = str.replaceAll("co.e", "code");
		int count = 0;
		for (int i = 0; i < str.length()-3; i++) {
			if(str.substring(i, i+4).equals("code")) {
				count++;
			}
		}
		System.out.println(count);
	}
}
