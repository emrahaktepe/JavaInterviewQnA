package JavaInterviewQnA;

import java.util.Arrays;

public class Interview_Set4 {


	
	//1.Write a method that will swap first and last characters in the string. Print out result into the console. The method will accept an sString argument
	
	//2.Write a method that will reverse a string. Your program should reverse a string only 5 characters long. If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!". Otherwise, reverse this word and print out result into the console. The method will accept an sString argument
	
	//3.Given a string, if the first or last chars are 'x' or 'X', return the string without those 'x' or 'X' chars,  otherwise return the string unchanged. The method will accept an sString argument
	
	//4.In mathematics, the factorial of a positive integer n, denoted by n!, is the product of all positive integers less than or equal to n.  Write a method that Calculate factorial and output result to the console. 
	
	//5.Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string. All the variables in the questions will be passed in to the method. -word, separator, count-
	
	//6.write a method that Return the number of times that the string "java" appears anywhere in the given string word.
	
	//7.Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

	//8.Given the array of words, it will print the word with the largest length. Assume that there are no 2 words with longest length
	//Example: words -> String[] arr = {"aaa","bbbbb","whasstupppp","longg","jaaaaavvaaaaaaaaaa"};

	//9.Given an array nums with 7 integers already assigned, write code to reverse it.Do not use any additional arrays or Strings.Example: num -> [4,3,2,44,1,100,55] -> num -> [55,100,1,44,2,3,4]

	//10.Given a 2d array of ints, find the biggest number(int) in the array and print it.
	
	public static void main(String[] args) {
		
		
		int[][] arr4 = {{1,2,3},{4,5,6,7},{77,88,99,12345}};
		//System.out.println(findLargestNumber10(arr4));		
		//int[] arr3 = {1,2,3,4,5,6,7,8,9};
		//System.out.println(Arrays.toString(reverseArray9(arr3)));
		//String[] arr2 = {"aaa","bbbbb","whasstupppp","longg","jaaaaavvaaaaaaaaaa"};
		//System.out.println(findLongestWord8(arr2));
		//int[] arr1 = {1,1,2,2,3,3,3,4,5,5,66,66};
		//System.out.println(findNonRepeatedNumber7(arr1));
		//System.out.println(countJava6("javakjavaJAVAJavaufkajsdkjava"));
		//System.out.println(countOfWord5("Ozkan",5,"/"));
		//System.out.println(factorial4(4));
		//System.out.println(removexX3("x"));
		//System.out.println(reverseString2("Cyber"));
		//System.out.println(swapFirstLastCharacters1("Ozkan"));
		  
		
	}
	
	
	
	//10
	public static int findLargestNumber10(int[][] arr) {
		
		int max = Integer.MIN_VALUE;
		
		for(int[] each1 : arr) {
			for(int each2 : each1) {
				
				if(each2 > max)
					max = each2;
			}
		}
		
		
		return max;
	}
	
	
	
	//9
	public static int[] reverseArray9(int[] arr) {
		
		//int[] arr3 = {1,2,3,4,5,6,7,8,9};
		
		int temp;
		
		for(int i = 0, j = 1; i < arr.length/2; i++, j++) {
			
			temp = arr[i];
			arr[i] = arr[arr.length - j];
			arr[arr.length - j] = temp;
		}
	
		return arr;
	}
	

	//8
	public static String findLongestWord8(String[] arr) {
		
		String result = "";
		
		for(String each : arr) {
			
			int len = each.length();
			
			if(len > result.length())
				result = each;
		}
	
		return result;
	}
	
	
	//7
	public static int findNonRepeatedNumber7(int[] arr) {
		
		int count = 0;
		
		for(int each : arr) {
		count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(each == arr[i])
				count++;
			
		}
		if(count == 1)
			return each;
		}
		
		return 0;
	}
	
	
	
	
	
	//6
	public static int countJava6(String str){
		//look for java 
		
		int count = 0;
		
		for(int i = 0; i < str.length() - 3; i++) {
			
			if(str.substring(i, i + 4).equalsIgnoreCase("java"))
				count++;
		}
	
		return count;
	}
	
	//5.
	public static String countOfWord5(String str, int count, String sep) {
		
		String result = "";
		
		for(int i = 0; i <= count; i++) {
			if(i == count)
				result+= str;
			else
			result+= str + sep;
			
		}
		
		return result;
	}
	
	//4
	public static int factorial4(int n) {
//		int result = 1;
//		
//		if(n <= 1)
//			return result;
//		
//		for(int i = n; i >= 1; i--) {
//			result*= i;
//		}
//		
//		return result;
		
		if(n <= 1)
			return 1;
		else
			return n * factorial4(n - 1);
	}
	

	//3
	public static String removexX3(String str) {
		
		if(str.length() > 1 && str.substring(0,1).equalsIgnoreCase("x") && str.substring(str.length() - 1).equalsIgnoreCase("x"))
			return str.substring(1,str.length() - 1);
	    if(str.substring(0,1).equalsIgnoreCase("x"))
			return str.substring(1);
		if(str.substring(str.length() - 1).equalsIgnoreCase("x"))
			return str.substring(0,str.length() - 1);
		
		
		return str;
	}
	
	
	//2
	public static String reverseString2(String str) {
		
		String result = "";
		
		if(str.length() < 5)
			return "too short!";
		else if(str.length() > 5)
			return "too long!";
		
		for(int i = str.length() - 1; i >= 0; i--) {
			result+= "" + str.charAt(i);
		}
		
		
		return result;
	}
	
	
	//1
	public static String swapFirstLastCharacters1(String str) {
		//Ozkan ---> nzkaO
		//if it was a sentence then use Array concept
		
		char first = str.charAt(0);
		char last = str.charAt(str.length() - 1);
		String middle = str.substring(1,str.length() - 1);
		
		return last + middle + first;
	}
	

	
	
	

	
	
	

	
	
	
	
}
