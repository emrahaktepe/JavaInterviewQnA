package f__Interview_Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Interview_Set8 {

	
	 
	//1.Write a a method appearsTwice() that returns true if value of variable target appears only twice in the string sentence, otherwise return false.EX : appearsTwice("java", "java is fun!") - returns false

	//2.Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:
	//EX : zz zy zx zw zv yz .... vv

	//3. blogDb gets an ArrayList of String Arrays(ArrayList<String[]>) from a database, each row from the database table is represented by a position in the ArrayList. each ArrayList position holds a string array that holds the row data. the database table columns are : id(string),title(string), content(string).
	//ArrayList<String[]> r example. Each item in ArrayList is a String ArrayList r = [["1","title","content1"],	["2","another title","content2"],
	//["3","yet another title","content3"]]
	//the String id argument of blogDb method is referring to a row from the table the arraylist holds.You need to loop through each element in the ArrayList and find the matching String[] with that id.Then return the title and content in format below.EX : blogDb(r,"1") -->title...content1
	
	//4.Write a method reverseVowels() that will return a string with reversed vowels.Input:str = "apple" --> Output:  str = "eppla" 

	//5.The method printList accepts an ArrayList of ArrayLists and returns it as a string.Method concatenates all values from each ArrayList and returns it as one. EX : printList([["a",b],["c",d]]) --> "abcd"

	//6.Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.EX : {{1,1,2}, //4 {3,1,2}, //6 {3,5,3}, //11  {0,1,2}  //3 } --->u get array back:	{4,6,11,3}

	//7.A 2D array is considered "magic" if the following are true: The array is square (N rows and N columns).The sums of each row, the sums of each column, and the sums of each diagonal are all equal.Complete the isMagic method so that it will determine whether a given array is magic.

	//EX : int[][] a = { 
	//				{1,1,1},
	//				{1,1,1},
	//				{1,1,1}
	//			};
	//			System.out.println(isMagic(a)); //true
		
	//int[][] b = {
	//				{1,1,2},
	//				{3,2,3},
	//				{1,4,1}
	//			};
	//			System.out.println(isMagic(b)); //false
				
		
	//8.Write a method to Switch the last element in an array with the first and return the array. EX : doSwitch([1,2,3,4]) --> [[4,2,3,1]

	//9.Complete the sumColumn method so that given a 2-D int array and an integer representing the column to sum, sum up the all elements in that column in the given array.

	//	EX :int[][] a = {	
	//				{-5,-2,-3,7},
	//				{1,-5,-2,2},
	//				{1,-2,3,-4}
	//			};
	//		System.out.println(sumColumn(a,1)); //should print -9
	
	//10.Complete the minVowels method so that given the array words, it will return the word with the least number of vowels - if there are two or more words with the same number of vowels, it should return the shortest word.You may find it helpful to write a helper method called countVowels that uses an accumulator algorithm to count the vowels.
	//EX :	String[] arr = {"hey","yolo","hi","this is long"};
		//System.out.println(minVowels(arr));
		//should print "hi"
	
	
		
	public static void main(String[] args) {

	
		
		
		//System.out.println(minVowel10(new String[][] {{"ayse","ozkan","ayata"},{"sibelayata","ayLINAYATA"},{"HI","BYE","UP"}}));
		//System.out.println(sumColumn9(new int[][] {{1,2,3},{1,2,3},{1,2,3}},2));
		//System.out.println(Arrays.toString(doSwitch8(new int[] {1,2,3,4,5})));
		//System.out.println(isMagic7(new int[][] {{1,1,1},{1,1,1},{1,1,1}}));
		//System.out.println(Arrays.toString(rowSums6(new int[][] {{1,1,2}, {3,1,2},{3,5,3},{0,1,2}})));
		
		ArrayList<ArrayList<String>> al2 = new ArrayList<ArrayList<String>>();
		al2.add(new ArrayList<String> (List.of("a","b","c","d")));
		al2.add(new ArrayList<String> (List.of("1","2","3","4")));
		//System.out.println(printList5(al2));
		
		//System.out.println(reverseVowels4("apple"));
		
		ArrayList<String[]> al = new ArrayList<String[]>();
		al.add(new String[] {"1","title1","content1"});
		al.add(new String[] {"2","title2","content2"});                                         
		//System.out.println(blogDb3(al,"2"));
		
		//printLetters2();
		//System.out.println(appearsTwice1("java is java is fun!","java"));

	}
	

	
	//10
	public static String minVowel10(String[][] arr) {
		//minVowel10(new String[][] {{"ayse","ozkan","ayata"},{"sibelayata","ayLINAYATA"},{"hi","BYEee","UuP"}}
		//should print "hi"
		int min = Integer.MAX_VALUE;
		String word = "";
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = 0; j < arr[i].length; j++) {
				int eachCount = countVowels(arr[i][j]);
				if(eachCount < min) {
					min = eachCount;
					word = arr[i][j];
				}
			}
		}
		return word;
	}
	
	public static int countVowels(String str) {
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'i' || str.charAt(i) == 'a' ||
			   str.charAt(i) == 'e' || str.charAt(i) == 'u' ||
		       str.charAt(i) == 'o' || str.charAt(i) == 'A' ||				   str.charAt(i) == 'I' || str.charAt(i) == 'E' ||				   str.charAt(i) == 'U' || str.charAt(i) == 'O')
			count++;
		}
		return count;
	}
	
	
	//9
	public static int sumColumn9(int[][] arr,int column) {
		//EX :int[][] a = {	
				//				{-5,-2,-3,7},
				//				{1,-5,-2,2},
				//				{1,-2,3,-4}
				//			};
				//sumColumn(a,1); //should print -9
		int sum = 0;
		for(int[] eachArray : arr) 
				sum+= eachArray[column];
		return sum;
	}
	
	
	//8
	public static int[] doSwitch8(int[] arr) {
		//EX : doSwitch([1,2,3,4]) --> [[4,2,3,1]
		
		int temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		return arr;
	}
	
	
	//7
	public static boolean isMagic7(int[][] array){
		  
		 int numberOfRows = array.length;
		  int sumR = 0, sumC = 0, sumD = 0;
		  int y = 0, z = 0, zz = 0;
		 
		  for(int i = 0; i < array.length; i++){
		    
		    if(array[i].length != numberOfRows)
		    return false;
		  
		    for(int j = 0; j < array[i].length; j++)
				  sumR += array[i][j];
			  
		    for(int x = 0; x < array.length; x++)
				  sumC += array[x][y];
		    y++;
		    
		    for(; z < array.length; z++,z++)
				  sumD += array[z][zz];
		    z = 0;
		    zz = 0;
		    if((!(sumR == sumC) && !(sumR == sumD)))
		        return false; 
		  }
		    return true;
	}
	
	
	//6
	public static int[] rowSums6(int[][] arr) {
		//EX : {{1,1,2},//4 {3,1,2},//6 {3,5,3},//11 {0,1,2} //3 } --->u get array back:	{4,6,11,3}
		int[] sums = new int[arr.length];
		int i = 0;
		for(int[] eachArray : arr) {
			int sum = 0;
			for(int eachInt : eachArray) {
				sum+= eachInt;
			}
			sums[i] = sum;
			i++;
		}
	
		return sums; 
	}
	
	
	
	//5
	public static String printList5(ArrayList<ArrayList<String>> al) {
		
		String result = "";
		
		for(ArrayList<String> eachAl: al) {
			for(String each : eachAl) {
				result+= each;
			}
		}
		return result;
	}
	
	
	public static boolean isVowel(char str) {
		return str == 'a' || str =='A' || str == 'e' || str =='E' || str == 'i' || str =='I' || str == 'o' || str =='O' || str == 'u' || str =='U' || str == 'y' || str=='Y';

	}
		  
	public static String reverseVowels4(String str) {
		 
		char[] array = str.toCharArray();
		 
		    int j = 0;
		    String vowels = "";
		    
		for(int i = 0 ; i < array.length; i++){
		      
		      if(isVowel(array[i])){
		       j++;
		       vowels += array[i];
		      }
		}  
		for(int i = 0; i < array.length; i++){
		            if(isVowel(array[i]))
		            array[i] = vowels.charAt(--j);
		            
		}
		   return String.valueOf(array);
		   /** String result = "";
		    
		    for(char x : array)
		    result += x;
		    
		    return result;*/
	}
	
	
	
	//3
	public static String blogDb3(ArrayList<String[]> al, String id) {
		//ArrayList r = [["1","title","content1"]]
		//EX : blogDb(r,"1") -->title...content1
		
		String result = "";
		
		for(int i = 0; i < al.size(); i++) {
			for(int j = 1; j < al.get(i).length; j++) {
				if(al.get(i)[0].equals(id))
					result = al.get(i)[1] + "..." + al.get(i)[2];
			}
		}
		return result;
	}
	
	
	//2
	public static void printLetters2() {
		//EX : zz zy zx zw zv yz .... vv
		
		String[] letters = {"z","y","x","w","v"};
		
		for(String each1 : letters) {
			for(String each2 : letters) {
				System.out.print(each1 + each2 + "...");
			}
		}
		
	}
	
	//1
	public static boolean appearsTwice1(String str, String target) {
		//appearsTwice("java is fun!", "java") - returns false
		
//		int len = target.length();
//        int counter = 0;
//        
//      for(int i = 0; i <= str.length()- (len); i++){
// 
//        if( str.substring(i,i+len).equals(target)){
//          counter++;
//        }
//        
//      }
//		return counter == 2;
		
		int count = 0;
		String[] arr = str.split(" ");
		for(String each : arr) {
			if(each.equals(target))
				count++;
		}
		
		return count == 2;
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
}
