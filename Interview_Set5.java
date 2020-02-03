package JavaInterviewQnA;

public class Interview_Set5 {

	//1.Print true if the string "cat" and "dog" appear the same number of times in the given string word. 
	
	//2.A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.
	
	//3.Print out the number of times that the string "hi" appears anywhere in the given string.
	
	//4.Write a program that will print out letters in the alphabetic order from A to Z and do it for 5 times
	
	//5.Given a string, print out true if the number of appearances of "java" anywhere in the string is equal to the number of appearances of "python" anywhere in the string (case sensitive).
	
	//6.We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap. String will be passed into your method 
	
	//7.Given a string str, print out the sum of the digits 0-9 that appear in the string, ignoring all other characters. Print out 0 if there are no digits in the string. 
	
	//8.Print out the number of times that the string "code" appears anywhere in the given string. We'll accept any letter for the 'd', so "cope", "core" and "cooe" count.
	
	//9.Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n to be output to the screen.
	/*	Example:
		input: 3
		output: *
		output: **
		output: ***
	*/
	
	//10.Write a program that will print the shortest word in the given array  

		
	public static void main(String[] args) {

		
		System.out.println(findShortestWord10(new String[] {"flafla","1234","afjdhkafklafsahflkalka","j","fasfasdf"}));
		//makeStairCase9(5);
		//System.out.println(countOfCode8("codecooecopecoee"));
		//System.out.println(sumOfDigits7("12345asdnjg12345"));
		//System.out.println(countTriples6("aaabbbbcccddddddd"));
//System.out.println(countOfJavaPython5("javaPythonfhkasjfhfkafjavajavaPythonPython"));
		//printAlphabet4();
		//System.out.println(countHi3("afjaksfkasjhfkafhihihihihihiHIHI"));
		//System.out.println(printSandwich2("sflskjflajflbredozkanayatabread"));
		//System.out.println(countOfCatAndDog1("kadjahkajsfalhsdogDOGcatCat"));

	}
	
	
	
	//10
	public static String findShortestWord10(String[] array) {
		
		String shortestWord = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() < shortestWord.length())
				shortestWord = array[i];
		}
		return shortestWord;
	}
	
	
	
	
	//9
	public static void makeStairCase9(int count) {
		/*
		for(int i = 1; i <= count; i++) {
			
			for(int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		String result = "";
		
		for(int i = 1; i <= count; i++) {
			result += "* ";
			System.out.println(result);
		}
		
		
	}
	
	
	
	
	//8
	public static int countOfCode8(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length() - 3; i++) {
			
			if(str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e')
				count++;
			
		}
		
		return count;
	}
	
	
	
	
	
	
	//7
	public static int sumOfDigits7(String str) {
		
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char each = str.charAt(i);
			
			if(each >= '0' && each <= '9') {
				String value = "" + each;
				sum+= Integer.parseInt(value);
			}
		}
		
		
		return sum;
	}
	
	
	
	//6
	public static int countTriples6(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length() - 2; i++) {
			
			if(str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
				count++;
			
		}
		

//		char[] ar = str.toCharArray();
//		
//		for(int i = 0; i < ar.length - 2; i++) {
//			
//			if((ar[i] == ar[i + 1]) && (ar[i] == ar[i + 2]))
//				count++;
//			
//		}
		
		return count;
		
		
		
	}
	
	
	
	
	//5
	public static boolean countOfJavaPython5(String str) {
		
		int countJava = 0;
		int countPython = 0;
		
		for(int i = 0; i < str.length() - 5; i++) {
			
			if(str.substring(i, i + 4).equalsIgnoreCase("java"))
				countJava++;
			if(str.substring(i, i + 6).equalsIgnoreCase("python"))
				countPython++;
		}
		
		
		return countJava == countPython;
	}
	
	
	
	
	
	//4
	public static void printAlphabet4() {
		
		
		for(int j = 1; j <= 5; j++) {
			for(char i = 65; i <= 90; i++) {
				System.out.print(i);
			}
				System.out.println();
		}
		
		
	}
	
	
	
	//3
	public static int countHi3(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length() - 1; i++) {
			if(str.substring(i, i + 2).equalsIgnoreCase("hi"))
				count++;
		}
		
		return count;
	}
	
	//2
	public static String printSandwich2(String str) {
		
		String result = "";
		
		int firstIndex = str.indexOf("bread");
		int lastIndex = str.lastIndexOf("bread");
		
		if(firstIndex == lastIndex)
			result = "nothing";
		else
		result = str.substring(firstIndex + 5, lastIndex);
		
		return result;
	}
	
	
	
	//1
	public static boolean countOfCatAndDog1(String str) {
		
		int countCat = 0;
		int countDog = 0;
		
		for(int i = 0; i < str.length() - 2; i++) {
			
			if(str.substring(i, i + 3).equalsIgnoreCase("cat"))
				countCat++;
			if(str.substring(i, i + 3).equalsIgnoreCase("dog"))
				countDog++;
		}
		
		
		return countDog == countCat;
	}
		


}
