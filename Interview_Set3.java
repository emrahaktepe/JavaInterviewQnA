package JavaInterviewQnA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Interview_Set3 {

	
	
	//1. FiND THE SECOND MAX in AN ARRAY THAT CONSISTS OF 10 RANDOM NUMBERS?DONT USE SORT METHOD
	//2. FiND THE SECOND MIN in AN ARRAY THAT CONSISTS OF 10 RANDOM NUMBERS?DONT USE SORT METHOD
	//3. Write a method to add all the digits in given number.
	//4. Write a method that verifies the number whether is arm-strong(It is a number that is equal to the sum of cubes of its digits) number or not?
	//5. Write a method to reverse a number
	//6. Write a method to print all the combination of the String. Ex: String = "GH" --> GH AND HG
	//7. Write a method where you remove the duplicate numbers from an array.
	
	public static void main(String[] args) {
		
		
		//System.out.println(removeDuplicates7(new int[]{1,1,2,2,3,3,4,5,5}));
	    permutation6("god", "");
		//System.out.println(reverseANumber5(6369));
		//System.out.println(isArmstrong4(15));
		//System.out.println(sumOfAllDigits3(75));
		//findSecondLowest2();
		//findSecondHighest1();
				
	}
	
	
	//7
	public static List<Integer> removeDuplicates7(int[] arr) {
		//{1,1,2,2,3,3,4,5,5} --> {1,2,3,4,5}
		
		List<Integer> list = new ArrayList<>();
		
		for(int each : arr) {
			if(!list.contains(each))
				list.add(each);
		}
		
		
		
		
		return list;
	}
	
	
	//6
	public static void permutation6(String str, String ans) {
		
	
		if(str.length() == 0) 
			System.out.println(ans);
					
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
	
			String ros = str.substring(0, i) + str.substring(i + 1);
			
			permutation6(ros, ans + ch);
					
		}
		
	
	}
	
	
	//5
	public static String reverseANumber5(int num) {
		
		String reversed = "";
			
		if(num == 0)
			return "0";
		
		while(num > 0) {
			
			reversed+= num%10;
			num/= 10;
		}
	
		return reversed;
	}
	
		
	//4
	public static boolean isArmstrong4(int num) {
		
		
		int sum = 0;
		int temp = num;
		
		while(num > 0) {
			
			int eachDigit = num%10;
			sum += eachDigit * eachDigit * eachDigit;
			num = num/10;
		}
		
		if(sum == temp)
			return true;
		
		
		return false;
	}
	
	
	
	
	
	
	
	//3
	public static int sumOfAllDigits3(int num) {
		
		int sum = 0;
		
		while(num > 0) {
			
			sum += num%10;
			num = num/10;
			
		}
		return sum;
	}
	
	
	
	//2
	public static void findSecondLowest2() {
		 
//		 int[] arr = createAnArray();
//		 
//		 System.out.println(Arrays.toString(arr));
//		 
//		 for(int j = 0; j < arr.length - 1; j++){
//				
//				for(int i = 0; i < arr.length - 1; i++) {
//				
//				if(arr[i] > arr[i + 1]) {
//					int temp = arr[i];
//					arr[i] = arr[i + 1];
//					arr[i + 1] = temp;
//				}
//				}
//				
//		}
//			System.out.println(Arrays.toString(arr));
//			System.out.println("Second min is : " + arr[1]);
			
			 int lowest = Integer.MAX_VALUE;
			 int secondLowest= Integer.MAX_VALUE;
			  
			  int[] array = createAnArray();
			  System.out.println(Arrays.toString(array));
			  
		        for (int i = 0; i < array.length; i++) {
		            if (array[i] < lowest) {
		            	secondLowest = lowest;
		                lowest = array[i];
		            } else if (array[i] < secondLowest)
		            	secondLowest = array[i];
		        }
		        System.out.println(secondLowest);
			
			
	    }
	
	
	 //1
	 public static void findSecondHighest1() {
		 
		 int[] arr = createAnArray();
		 
		 System.out.println(Arrays.toString(arr));
		 
		 for(int j = 0; j < arr.length - 1; j++){
				
				for(int i = 0; i < arr.length - 1; i++) {
				
				if(arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				}
				
		}
			System.out.println(Arrays.toString(arr));
			System.out.println("Second max is : " + arr[1]);
			
//			 int highest = Integer.MIN_VALUE;
//			 int secondHighest = Integer.MIN_VALUE;
//			  
//			  int[] array = createAnArray();
//			  System.out.println(Arrays.toString(array));
//			  
//		        for (int i = 0; i < array.length; i++) {
//		            if (array[i] > highest) {
//		                secondHighest = highest;
//		                highest = array[i];
//		            } else if (array[i] > secondHighest)
//		                secondHighest = array[i];
//		        }
//		        System.out.println(secondHighest);
			
			
	    }
	 

	 
	 
		//create an array of random numbers
		public static int[] createAnArray() {
					
				int[] arr = new int[10];
				
				for(int i = 0; i < arr.length; i++) {
					arr[i] = new Random().nextInt(100);
				}
				
				return arr;			
		 }
		
	
}
