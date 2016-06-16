package peakelement;

import java.util.NoSuchElementException;

public class InflectionPoint {
	
	/*INPUT: array of integers, initially monotonically increasing, then monotonically decreasing
	**CONDITION: array must have at least three elements
	**RETURN: index of element that is less than the previous element*/
	public static int findIndex(int[] arr) {
		//skip first 2 elements as they are in increasing order
		for(int i = 2; i < arr.length; i++) {
			if(arr[i] < arr[i-1]) {
				return i;
			}
		}
		throw new NoSuchElementException("sequence is always increasing");
	}
	
	public static void main(String[] args) {
		System.out.println("Program running");
		
		int[] sample = {5, 6, 10, 8, 1};
		System.out.println("index: "+findIndex(sample));
		
		
		System.out.println("Program finished");
	}
}