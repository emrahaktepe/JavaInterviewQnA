package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Interview_Set9 {

	
	
	
	//1.Print A-Z  10 times in 26 rows
	//A
	//AB
	//ABC

	//2.Create a method where you find the sum of the numbers up to num

	//3.Create a method where you find the sum of the divisors of the passing parameter

	//4.Ask user for a  number, print the cube of the number, do this repeatedly until user enters a negative number
	
	//5.Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

	//6.Given a String array words, iterate through each word and print first and last letter of each element in separate lines.

	//7.Given the array words, it will print the word with the largest length. Assume that there are no 2 words with longest length

	//8.String str = "Cybertek Batch Spartan is most hardworking Batch ever";,turn each word into char array print reverse of each char out with seperated by - output : k-e-t-r-e-b-y-C 	...

	//9.Create a string ArrayList with days of the week then find the day with most number of letters in it(longest String) 
	
	//10.Create a string ArrayList with days of the week then print the days of the week backwards
	
		
	public static void main(String[] args) {
		
		//printDaysBackwords10(new ArrayList<String> (List.of("mONDAY","tUESDAY","Wednesday","Thursday","Friday","Saturday","Sunday")));	
		//System.out.println(longestDayOfWeek9(new ArrayList<String> (List.of("mONDAY","tUESDAY","Wednesday","Thursday","Friday","Saturday","Sunday"))));
		//printReversedWords8("Cybertek Batch Spartan is most hardworking Batch ever");
		//printLongest7(new String[] {"ozkan","ayatas","ayse","sibel","aylin"});
		//printLetters6(new String[] {"ozkan","ayata","ayse","sibel","aylin"});
		//System.out.println(findUniqueNumber5(new int[] {1,1,2,3,4,3}));
		//cubeOfNumber4();
		//System.out.println(totalSumOfDivisors3(5));
		//System.out.println(sumUpToNum2(5));
		//formTriangleWithAlphabet1();
	}
	
	//10
	public static void printDaysBackwords10(ArrayList<String> al) {
		
		for(int i = al.size() - 1; i >= 0; i--) {
			System.out.print(al.get(i) + " ");
		}
		
		
	}
	
	//9
	public static String longestDayOfWeek9(ArrayList<String> al) {
		String longestDay = "";
		
		for(String each : al) {
			if(each.length() > longestDay.length())
				longestDay = each;
		}
		return longestDay;
	}
	
	
	
	
	
	//8
	public static void printReversedWords8(String str) {
		
		String[] arrOfWords = str.split(" ");
		
		for(int i = 0; i < arrOfWords.length; i++) {
			char[] arrOfLetters = arrOfWords[i].toCharArray();
				String eachResult = "";
					for(int j = arrOfLetters.length - 1;j >= 0; j--)
						eachResult+= arrOfLetters[j]+"-";
					System.out.println(eachResult);
		}
	}
	
	
	//7
	public static void printLongest7(String[] words) {
			
		String longest = "";
		
		for(int i = 0; i < words.length; i++) {
				if(words[i].length() > longest.length())
					longest = words[i];
		}
		System.out.println(longest);
	}
	
	
	//6
	public static void printLetters6(String[] words) {
		//String[] words{"hey"} --> hy
		
		for(int i = 0; i < words.length; i++) {
			String eachWord = words[i];
			System.out.println("#" + (i + 1) +"--> " +eachWord.charAt(0) + eachWord.charAt(eachWord.length() - 1));
			
		}
		
	}
	
	
	//5
	public static int findUniqueNumber5(int[] arr) {
		//int[]{1,1,2,2,3,3,4}  --> 4
		
		Arrays.sort(arr);		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] == arr[i + 1]) {
				if(i != arr.length - 3) {
					i++;
				}else {
					return arr[i + 2];
				}
					
			}else {
				return arr[i];
			}
		}
		return 0;
	}
	
	//4
	public static void cubeOfNumber4() {
				
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number!");
		int num = scan.nextInt();
				
			while(num >= 0) {
				System.out.println(num*num*num);
				System.out.println("Enter another one!");
				num = scan.nextInt();
			}
				
			System.out.println("Sorry u messed up by entering a negavite");
		}
				
	//3
	public static int totalSumOfDivisors3(int num) {
				
		int sum = 0; 
				
		for(int i = 1; i <= num; i++) {
			if(num%i == 0)
				sum+= i;
			}
			return sum;
		}	
			
	//2
	public static int sumUpToNum2(int num) {
				
		int sum = 0;
		for(int i = 0; i <= num; i++) {
			sum+= i;
		}
				
		return sum;
	}
		
	
	//1
	public static void formTriangleWithAlphabet1() {
			
		for(int a = 1; a < 27; a++) {
			for(int i = 65; i <= 90; i++) {
				for(int j = 65; j <= i; j++) {
					System.out.print((char) j);
				}
			System.out.println();
			}
		}
			
	}
		
	
		
		
	
	
}
