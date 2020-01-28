package JavaInterviewQnA;

public class Q4_03 {

//	4_03 Given a string, if the first or last chars are 'x' or 'X', 
//		 return the string without those 'x' or 'X' chars,  
//		 otherwise return the string unchanged. 

	public static void main(String[] args) {		
		
		xLess("denemeX");
		xLess("Xdenemex");
		xLess("xdeneme");


	}
	
	public static void xLess(String str) {
		
		if (str.substring(0, 1).equalsIgnoreCase("x")) {
			str = str.substring(1);
		}
		if (str.substring(str.length()-1).equalsIgnoreCase("x")) {
			str = str.substring(0, str.length()-1);
		}
		System.out.println(str);
	}
	
}
