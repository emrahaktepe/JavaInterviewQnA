package f__Interview_Logic;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Random;

public class Interview_Set2 {

	

	//1.Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
	
	//2.Complete a void method printUniqueNumbers() that will print all unique integers(non repeated ones) from an array of ints. Every single unique int should be printed from the new line. 
	
	//3.uniqueChars is a method that you will code now, should be able to accept any string in the world and return unique characters from the parameter.
	//Examples:uniqueChars("java") ==> "jav"
	
	//4.mergR merges two arrays into one. it gets two int arrays and returns a combined array
	//for example: mergR([1,2,3],[4,5,6]) --> returns [1,2,3,4,5,6]
	
	//5.combine two String arrays into one arraylist and return it as a string.EX:combineRs(["f","o","o"],[" b","a","r"]) --->  "foo bar"
	
	//6.Write a method that gets any number from a string it gets and returns the number string.EX :extractNum("aa2aa3") ==> 23
	
	//7.Write a removeAll() takes two parameters: an ArrayList of Strings called wordList, and a 	String called targetWord.So remove the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo"));  ----> removeAll(wordList,"hi"); --->["hey","yo"]
	
	//8.Populate method accepts an empty int array and populates it with numbers counting up.EX : populate(new int[3])  ---> returns:[1,2,3]
	
	//9.Store 10 random numbers into an Array then find the max and min
	
	//10.Reverse an array with two different ways 



	public static void main(String[] args) {
	
		//reverseAnArray10(new int[] {1,2,3,4,5});
		randomMinAndMax9();
		//System.out.println(Arrays.toString(populateArray8(10)));
		//removeAll7(new ArrayList<String>(List.of("h","h","a","y")),"h");
		//System.out.println(extractNumbers6("afas21as2g35dg456ds1sd3h1s65"));
		//System.out.println(mergeArrays5(new String[] {"ozkan ","ayata "}, new String[] {"what ", "up!!!"} ));
		//System.out.println(Arrays.toString(mergeArrays4(new int[] {1,2,3}, new int[] {4,5,6,7,8,9,10})));
		//System.out.println(printUniqueCharacters3("aayyaattaa"));
		//printUniqueNumbers2(arr1);
		int arr1[] = {1,2,3,4,5}; 
		//System.out.println(Arrays.toString(shiftAnArray1(arr1)));
	}
	
	
	
	//10
	public static void reverseAnArray10(int[] arr) {
		
		for(int i = 0, j = 1; i < arr.length/2; i++, j++) {
			
			int temp = arr[i];
			arr[i] = arr[arr.length - j];
			arr[arr.length - j] = temp;
		}
		System.out.println(Arrays.toString(arr));
		
//		int newArray[] = new int[arr.length];
//		
//		for(int i = 0, j = 1; i < newArray.length; i++, j++) {
//			newArray[i] = arr[arr.length - j];
//		}
//		
//		System.out.println(Arrays.toString(newArray));
		
	}
	
		
	//9
	public static void randomMinAndMax9() {
		
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int rnd = (int) (Math.random() * 100);
			//int rnd = new Random().nextInt(100);
				arr[i] = rnd;
		}
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int each : arr) {
			
			if(each > max)
				max = each;
			if(each < min)
				min = each;
			
		}
		
		System.out.println("Min " + min + " Max " + max);
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	//8
	public static int[] populateArray8(int len) {
		
		int[] arr = new int[len];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		
		return arr;
	}
	

	//7
	public static void removeAll7(ArrayList<String> al, String targetWord) {
		
		for(int i = 0; i < al.size(); i++) {
			
			if(al.get(i).equals(targetWord)) {
				al.remove(i);
			i--;
			}
		}
		
		System.out.println(al);
	}
	
	
	
	//6
	public static String extractNumbers6(String str) {
		//extractNum("aa2aa3") ==> 23
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) >= 48 && str.charAt(i) <= 57)
				result+= str.charAt(i);
			
		}
	
		return result;
	}
	
	
	//5
	public static String mergeArrays5(String arr1[], String arr2[]) {
		//combineRs(["f","o","o"],[" b","a","r"]) --->  "foo bar"
		
		String result = "";
		
//		List<String> mergedArrays = Arrays.asList(arr1);
//		
//		ArrayList<String> combineRs = new ArrayList<>(mergedArrays);
//		
//		for(String each : arr2)
//			combineRs.add(each);
//		
//		for(String each : combineRs) 
//			result+= each;
//		
		
		ArrayList<String> combineRs2 = new ArrayList<String>();
		
		for(int i = 0; i < arr1.length + arr2.length; i++) {
			
			if(i < arr1.length)
				combineRs2.add(arr1[i]);
			else
				combineRs2.add(arr2[i - arr1.length]);
		}
		
		for(String each : combineRs2)
			result+= each;
		
		
		
		return result;
	}
	
	
	
	
	//4
	public static int[] mergeArrays4(int[] arr1, int[] arr2) {
		//mergR([1,2,3],[4,5,6]) --> returns [1,2,3,4,5,6]
		
		
//		  int len = arr1.length + arr2.length;	   
//		   int[] newArray  = Arrays.copyOf(arr1, len);   
//		   for(int i = arr1.length, j = 0; i < len; i++,j++){
//		     
//		     newArray[i] = arr2[j];
//		     
//		   }
//		    return newArray;
		
		int len = arr1.length + arr2.length;
		
		int[] result = new int[len];
		
		for(int i = 0; i < len; i++) {
			
			if(i < arr1.length)
				result[i] = arr1[i];
			else
				result[i] = arr2[i - arr1.length];
		}
		return result;
	}
	
	//3
	public static String printUniqueCharacters3(String str) {
		//uniqueChars("java") ==> "jav"
		
		String result = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			String each = str.substring(i, i + 1);
			
			if(!result.contains(each))
				result+= each;
		}
		return result;
	}
	
	//2
	public static void printUniqueNumbers2(int[] arr) {
		
        for(int i = 0; i < arr.length; i++){
         
         int count = 0;
          
          for(int j = 0; j < arr.length; j++){
            
            if(arr[i] == arr[j])
                 count++;
          }
          if(count == 1)
          System.out.println(arr[i]);
        
        }
		
	}
        
        
    //1   
	public static int[] shiftAnArray1(int[] arr) {
		//left shift {6, 2, 5, 3} becomes {2, 5, 3, 6}
		
		int temp;
		for(int i = 0; i < arr.length - 1; i++) {
			
			temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}		
		return arr;
	}

	}
	

