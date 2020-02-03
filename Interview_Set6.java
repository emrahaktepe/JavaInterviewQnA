package JavaInterviewQnA;


import java.util.*;


public class Interview_Set6 {
	
	//1.Complete a void method printOnce() that will print all integers only once without repeating them from an array of ints.EX : [1,1,2,3,4,5,4,5] ---> 1,2,3,4,5
	
	//2.Write a method where u enter numbers until the total is 40
	
	//3.Write a method where ask the question and until u get a yes u keep asking
	
	//4.Write a method where u return the total until user enters a negative.
	
	//5.Write a method where u enter numbers until 3 trials or sum up to 100
	
	//6.appendPosSum() returns an ArrayList<Integer> and a parameter as an ArrayList<Integer>.		This method should Create a new ArrayList of Integers.Add only the positive Integers to the new 	ArrayList.Sum the positive Integers in the new ArrayList and add the Sum as the last element.EX: if the incoming ArrayList contains the Integers (4,-6,3,-8,0,4,3), the ArrayList 	that gets returned should be (4,3,4,3,14), with 14 being the sum of (4,3,4,3).  The original 	ArrayList should remain unchanged.
	
	//7.addElements() accepts 2 int arrays and adds each element value of two arrays and returns a 	new array. You can assume that each array has 5 elements.EX : addElements(new int[][10,40,50,3], new int[][11,0,500,44]); --> [21,40,550,47]

	//8.Write a removeInst() method gets an Arraylist of Integers and a number(Integer). It removes 	any instance of the number it gets from the Arraylist.EX : removeInst([1,1,2,3,1,4],1) ---->  [2,3,4]
		
	//9.Write a method is called twoTimes(). This method should create a new ArrayList of Integers 	that contains every value of the ArrayList parameter repeated twice.EX: ArrayList<Integer> (List.of(1,5,3,7)) ---> (1,1,5,5,3,3,7,7)

	//10.Given two positive integers m and n, find their greatest common divisor, that is, the largest positive integer that evenly divides both m and n.EX : if m = 15 and n = 25, then result greatest common divisor is = 5.
	
	
	
	public static void main(String[] args) {

		
		
		//System.out.println(findGCF10(17,170));
		//System.out.println(twoTimes9(new ArrayList<Integer> (List.of(1,5,3,7))));
		//System.out.println(removeInst8(new ArrayList<Integer>(List.of(1,1,2,3,1,4)),1));
		//System.out.println(Arrays.toString(sumOfArrays7(new int[] {1,2,3}, new int[] {1,2,3})));
		//System.out.println(appendPosSum6(new ArrayList<Integer>(Arrays.asList(2,1,4,3,-5,-9))));
		//goUntilThreeTrialsOr1Hundred5();
		//goUntilGetANegavite4();
		//getAYes3();
		//sumToForty2();
		//printIntOnce1(new int[] {1,1,2,2,3,3,4,4,5,5});
	}

	

	//10
	public static int findGCF10(int num1, int num2) {
			
		int gcf = 0;
		int max = Math.max(num1, num2);
			
		for(int i = 1; i <= max; i++) {
			if(num1%i == 0 && num2%i == 0 && i > gcf)
				gcf = i;				
		}
					
		return gcf;
	}
		

	//9
	public static ArrayList<Integer> twoTimes9(ArrayList<Integer> al){
		//ArrayList<Integer> (List.of(1,5,3,7)) ---> (1,1,5,5,3,3,7,7)
		
		
//		 ArrayList<Integer> result = new ArrayList<>(al);
//		    
//		    for(int i = 0, j = 0; i < al.size(); i++,j+=2){
//		      
//		      result.add(j, al.get(i));
//		      
//		    }
//		    
//		    return result;
		
		
		ArrayList<Integer> newAl = new ArrayList<Integer>();
		
		for(Integer each : al) {
			newAl.add(each);
			newAl.add(each);
		}
		
		return newAl;
	}	
	
	
	//8
	public static ArrayList<Integer> removeInst8(ArrayList<Integer> al, int num){
		//removeInst([1,1,2,3,1,4],1) ---->  [2,3,4]
		
		for(int i = 0; i < al.size(); i++) {
			if(al.get(i) == num) {
				al.remove(i);
				i--;
			}
		}
	
		return al;
	}
	
		
	
	//7
	public static int[] sumOfArrays7(int[] arr1, int[] arr2) {
		
		int[] newarr = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++)
			newarr[i] = arr1[i] + arr2[i];
		
		return newarr;
	}
	
	
	
	//6
	public static ArrayList<Integer> appendPosSum6(ArrayList<Integer> al){
		//(4,-6,3,-8,0,4,3), the ArrayList 	that gets returned should be (4,3,4,3,14)
		ArrayList<Integer> newAl = new ArrayList<>();
		int sum = 0;
		
		for(Integer each : al) {
			if(each > 0) {
				newAl.add(each);
				sum+= each;
			}
		}
		newAl.add(sum);
		System.out.println("Original ArrayList " + al);
		return newAl;		
	}
	
	
	//5
	public static void goUntilThreeTrialsOr1Hundred5() {
			
		Scanner scan  = new Scanner(System.in);
		int sum = 0;
		int trials = 0;
						
		for(System.out.println("Enter a number"); trials < 3 && sum < 100; System.out.println("Keep Entering")) {
					
			int num = scan.nextInt();
			trials++;
			sum+= num;
			if(sum >= 100)
				break;
					
				
		}
		System.out.println("Okay, this is the end of the game.\nYour number of trials  = " + trials + " and your sum is " + sum);
		
		}
	
	
	//4
	public static void goUntilGetANegavite4() {
		
		Scanner scan  = new Scanner(System.in);
		int sum = 0;
		int num = 0;
			
		for(System.out.println("Enter a number"); num >= 0; System.out.println("Keep Entering")) {
				
			num = scan.nextInt();
			if(num < 0)
				break;
			sum+= num;		
			
		}
		System.out.println("No u just entered a negative number so \nyour total is = " + sum);
		
		}
		
	
	
	//3
	public static void getAYes3() {
			
		Scanner scan  = new Scanner(System.in);
		String answer = "";
			
		for( ; !answer.equalsIgnoreCase("yes"); ) {
				
			System.out.println("Do you love Java?" + "\n" + "Please Answer!");
			answer = scan.nextLine();
		}
		System.out.println("Finally");
		}
	
	
	
	//2
	public static void sumToForty2() {
		
		Scanner scan  = new Scanner(System.in);
		int sum = 0;
		
		for(System.out.println("Enter a number"); sum < 40; System.out.println("Keep Entering")) {
			
			int num = scan.nextInt();
			sum+= num;		
			if(sum >= 40)
				break;
		}
		System.out.println("Total is now >= 40 which is = " + sum);
		
	}
	
	
	
	
	//1
	public static void printIntOnce1(int[] arr) {
		
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			if(!al.contains(arr[i])) {
				al.add(arr[i]);
				System.out.println(arr[i]);
			}
		}
		System.out.println(al);
	
	}
	
	
}
