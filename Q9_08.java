package JavaInterviewQnA;

public class Q9_08 {

//	9_08 String str = "Cybertek Batch Spartan is most hardworking Batch ever";,
//		 turn each word into char array print reverse of each char out with 
//		 seperated by - output : k-e-t-r-e-b-y-C 	...

	public static void main(String[] args) {
		String str = "Cybertek Batch Spartan is most hardworking Batch ever";
		
		//	created a string array by splittin each word from spaces
		String[] arr = str.split(" ");
		
		//	created a loop to run inside the string array
		for (int i = 0; i<arr.length; i++) {
			//	created a char array to add each string item of string arr as char array
			char[] ch = arr[i].toCharArray();
			
			//	reversing each char array using the reverse method
			ch = reverseChar(ch);
			
			//	printing each one on a new line
			System.out.println(ch);
		}
		
	}
	
	public static char[] reverseChar(char[] ch){	
		
		// 	created a new char array and the length is length*2-1 since there is gonna be -
		char[] chNew = new char[ch.length*2-1];
		
		//	used this to manage the index of the new char array inside the loop below
		int j = 0;
	
	//	loop goes in the char array and reverses it while addin - after each character	
	for(int i = ch.length-1; i >= 0; i--) {		
		chNew[j]=ch[i];
		// to avoid adding - at the very end used this if
		if(i!=0) {
		chNew[j+1]='-';
		} 
		//	j+=2 instead of j++ because adding extra - after each char 
		j+=2;
	}	
	return chNew;

}
	
}
