package JavaInterviewQnA;

public class Q5_06 {

//	5_06 A "triple" in a string is a char appearing three times in a row. 
//		 Print out the number of triples in the given string. The triples may overlap. 
//		 String will be passed into your method 

	public static void main(String[] args) {
		String str = "abcdddefeeehhhyjjssskkwwwlllm";
		
		tripleCount(str);
	}
	
	public static void tripleCount(String str) {
		int triple = 0;
		for(int i = 0; i < str.length()-2; i++) {
			if(str.substring(i, i+3).equals(str.substring(i, i+1)+str.substring(i, i+1)+str.substring(i, i+1))) {
				triple++;
		}
	}
		System.out.println(triple);

	}
}
