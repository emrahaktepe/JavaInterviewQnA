package JavaInterviewQnA;

public class Q4_10_PrintMaxOf2DArray {

//	4_10 Given a 2d array of ints, find the biggest number(int) in the array and print it.

	public static void main(String[] args) {
		int[][] arr = {{3, 4}, {5, 6}, {9, 8, 7}};
		int ref = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] > ref) {
					ref = arr[i][j];
				}
			}
		}
		System.out.println(ref);
	}
	
}
