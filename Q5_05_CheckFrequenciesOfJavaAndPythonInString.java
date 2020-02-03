package JavaInterviewQnA;

public class Q5_05_CheckFrequenciesOfJavaAndPythonInString {

//	5_05 Given a string, print out true if the number of appearances of "java" 
//		 anywhere in the string is equal to the number of appearances of "python" 
//		 anywhere in the string (case sensitive).

	public static void main(String[] args) {
		String jP = "java python python java pythonjava";
		
		int countJ = 0;
		int countP = 0;
		
		for(int i = 0; i < jP.length()-4; i++) {
			if(jP.substring(i, i+5).equals("java")) {
				countJ++;
			}
		}
		
		for(int i = 0; i < jP.length()-6; i++) {
			if(jP.substring(i, i+7).equals("python")) {
				countP++;
			}
		}
		
		System.out.println(countJ == countP);
	}
	
	
}
