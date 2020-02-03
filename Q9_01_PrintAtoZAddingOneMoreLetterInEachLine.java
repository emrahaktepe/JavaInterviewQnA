package JavaInterviewQnA;

public class Q9_01_PrintAtoZAddingOneMoreLetterInEachLine {
//	9_01 Print A to Z adding one more at each line in 26 rows
//		 A
//		 AB
//		 ABC

	public static void main(String[] args) {
		
		String str = "";
		
		for(int i = 65; i < 65+26; i++) {
			str += (char)i;
			System.out.println(str);
		}
	}
}
