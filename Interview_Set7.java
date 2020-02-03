package f__Interview_Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Interview_Set7 {

	
	//1.Write a method that can remove duplicated values from an Integer ArrayList.EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) ---> [1,2,3,4,5]

	//2.Create a method that can divide two positive numbers without using division operators and Math class. 
				
	//3.Write method that removes all duplicate from String. EX : ayata --> ayt
			
	//4.Write a method that prints out the numbers from 1 to 30, but for numbers which are multiple of 3 prints FIN instead of number, and for numbers multiple by 5 prints RA instead of number, and for numbers multiple both by 3 and 5 prints FINRA
			
	//5.Write a method that returns max value out of array of integers, and than Srtings.int[][] arr = {{2,3,4},{55,66,77}}; max(arr) -> 4...DO NOT use sort method
			
	//6.Create a method that can find the unique characters from the String 
	//EX : unique("AAABBBCCCDEF") ==> "DEF";
				
	//7.Create a method that can find the frequencies of the String: frequencies("AAABBCCCCDDD") ==>  A3B2C4D3			
			
	//8.Create a method that can sort an array in descending order. Do not use sort method
			
	//9.Write method to extract lowercase letters and numbers separately from given String EX:a1b2c3 --> abc and ---> 123

	//10.Print a String 5 times in one row. print total of 5 rows of same message.

	

	public static void main(String[] args) {

		//printWord10(new String("java"));
		//System.out.println(printLowerCaseLetters9(new String("a1b2c3")));
		//System.out.println(Arrays.toString(sortintArray8(new int[] {1,2,3,4,5})));
		//System.out.println(frequencyOLetters7(new String("AAABBCCCCDDD")));
		//System.out.println(uniqueLetters6("AAABBBCCCDEF"));
		//System.out.println(maxValue5(new int[][] {{1,2,3,4,5,6},{7,8,9}}));
		//printFINRA4();
		//System.out.println(removeDuplicates3("ayata"));
		//divideWithoutDivision2(-2,0);
		//System.out.println(removeDuplicates1(new ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5))));

		
		
	}
	
	//10
	public static void printWord10(String word) {
	
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}
	
	//9
	public static String printLowerCaseLetters9(String str) {
		//EX : a1b2c3 --> abc and ---> 123
		
		String resultLetters = "";
		String resultNumbers = "";
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 90 && str.charAt(i) <= 122)
				resultLetters+= str.charAt(i);
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
				resultNumbers+= str.charAt(i);
			
		}
		return "Letters : " + resultLetters + "\nNumbers : " + resultNumbers; 
	}
	
	//8
	public static int[] sortintArray8(int[] arr) {
				
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] < arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1]; 
					arr[j + 1] = temp;
				}	

			}
		}
		return arr;
	}
	
	//7
	public static String frequencyOLetters7(String str) {
	//frequencies( "AAABBCCCCDDD") ==>  A3B2C4D3
		
		String result = "";
		int count;
		
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count++;
			}
			if(!result.contains(str.charAt(i)+""))
				result+= str.charAt(i) +""+ count;
		}
		return result;
	}
	
	
	//6
	public static String uniqueLetters6(String str) {
		//EX : unique("AAABBBCCCDEF") ==> "DEF";
		String result = "";
		int count;
		
		for(int i = 0; i < str.length(); i++) {
			count = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(i) == str.charAt(j))
					count++;
			}
			if(count == 1)
				result+= str.charAt(i);
		}
		return result;
	}
	
	
	
	
	//5
	public static int maxValue5(int[][] arr) {
		
		int max = Integer.MIN_VALUE;
		
//		for(int[] eachArray : arr)
//			for(int each : eachArray) {
//				if(each > max)
//					max = each;
//			}
		
		for(int i = 0; i < arr.length; i++) {
			int[] eachArray = arr[i];
			Arrays.sort(eachArray);
			int eachInt = eachArray[eachArray.length - 1];
			if(max < eachInt)
				max = eachInt;
		}
	
		return max;
	}
	
	
	
	//4
	public static void printFINRA4() {
		
		for(int i = 1; i <= 30; i++) {
			
			if(i%15 == 0)
				System.out.print("FINRA ");			
			else if(i%3 == 0)
				System.out.print("FIN ");
			else if(i%5 == 0)
				System.out.print("RA ");
			else
			System.out.print(i + " ");
		}
		return ;
	}
	
	//3
	public static String removeDuplicates3(String str) {
		
		String result = "";
//		for(int i = 0; i < str.length(); i++) {
//			if(!result.contains(str.charAt(i)+""))
//				result+= str.charAt(i);
//		}
		
		String[] strArray = str.split("");
		for(int i = 0; i < strArray.length; i++) {
			if(!result.contains(strArray[i]))
				result+= strArray[i];
		}
		return result;
	}
	
	//2
	public static void divideWithoutDivision2(int a, int b) {
	
		if(b == 0) {
			System.out.println("The division not possible or infinity");
			System.exit(0);
		}
		int count = 0;
		for(;a - b >= 0;) {
			a-= b;
			count++;
		}
		System.out.println("Quotient is a/b = " + count);
	}
	
	//1
	public static ArrayList<Integer> removeDuplicates1(ArrayList<Integer> al){
		
		for(int i = 0; i < al.size(); i++) {
			for(int j = i + 1; j < al.size(); j++) {
				if(al.get(i) == al.get(j)) {
					al.remove(j);
					j--;
				}
			}
		}
		return al;
	}

}
