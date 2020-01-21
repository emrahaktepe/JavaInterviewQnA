package JavaInterviewQnA;

public class Q9_08 {

//	9_08 String str = "Cybertek Batch Spartan is most hardworking Batch ever";,
//		 turn each word into char array print reverse of each char out with 
//		 seperated by - output : k-e-t-r-e-b-y-C 	...

	public static void main(String[] args) {
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		String[] arr = str.split(" ");
		for (int i = 0; i<arr.length; i++) {
			char[] ch = arr[i].toCharArray();
			ch = reverseChar(ch);
			System.out.println(ch);
		}
		
	}
	
	public static char[] reverseChar(char[] ch){	
		char[] chNew = new char[ch.length];
		int j = 0;
		
	for(int i = ch.length-1; i >= 0; i--) {		
		chNew[j]=ch[i];
		j++;
	}	
	return chNew;

}
	
}
