package JavaInterviewQnA;

public class Q7_05_PrintMaxValueOfEachArrayIn2DArray {

//	7_05 Write a method that finds the max values of each array of a 2D int[] array, than return as Strings. 
//		 int[][] arr = {{2, 3, 4}, {5, 6, 7}, {3, 5, 7}}; max(arr) -> 4... DO NOT use sort method

	public static void main(String[] args) {
		int[][] arr = { { 2, 3, 4 }, { 5, 6, 7 }, { 9, 5, 7 } };

		System.out.println(maxOfArrays(arr));
	}

	public static String maxOfArrays(int[][] arr) {
		int ref = 0;
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			ref = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > ref) {
					ref = arr[i][j];
				}				
			}
			str += "" + ref;
		}
		return str;
	}
}