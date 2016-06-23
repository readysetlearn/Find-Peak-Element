import java.util.NoSuchElementException;
import java.util.IllegalArgumentException;

public class InflectionPoint {
	
	/*INPUT: array of integers, initially monotonically increasing, then monotonically decreasing
	**CONDITION: array must have at least three elements
	**RETURN: index of element that is less than the previous element*/
	public static int findIndex(int[] arr) {
		findIndex(arr, 'i');
	}
	
	/*INPUT: array of integers, initially monotonically increasing, then monotonically decreasing
	**OR initially monotonically decreasing, then monotonically increasing.
	**CONDITION: array must have at least three elements.
	**RETURN: if initially increasing, index of first element that is less than the previous element;
	**else if initially decreasing, index of first element that is greater than the previous element.*/
	public static int findIndex(int[] arr, char direction) {
		if(direction == 'i') {//initially increasing
			//skip first 2 elements as they are in increasing order
			for(int i = 2; i < arr.length; i++) {
				if(arr[i] < arr[i-1]) {
					return i;
				}
			}
			
			throw new NoSuchElementException("sequence is always increasing");
		}else if(direction == 'd') {//initially decreasing
			//skip first 2 elements as they are in increasing order
			for(int i = 2; i < arr.length; i++) {
				if(arr[i] > arr[i-1]) {
					return i;
				}
			}			
		} else {
			throw new IllegalAccessException("invalid parameter given");
		}
	}
	
	/*return true if and only if arr has (exactly) inflection point*/
	public static boolean hasInflectionPoint(int[] arr) {
		if(arr.length < 3) {
			return false;
		}
		
		//check if sequence is always increasing
		int previous = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < previous) {
				return false;
			}
			
			previous = arr[i];
		}
		
		//check if sequence is always decreasing
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > previous) {
				return false;
			}
			
			previous = arr[i];
		}
		
		char direction = initialDirection(arr);
		int changeIndex = findIndex(arr, i);
		//must check to see if changeIndex was only "inclfection point"
		//e.g. may be several if just a bunch of random numbers
		for(int i = changeIndex + 1; i < arr.length; i++) {
			if(direction == 'i') {
				if(arr[i] > arr[i-1])
					return false
			} else if(direction == 'd') {
				if(arr[i] < arr[i-1])
					return false
			}
		}
		
		return true;
	}
	
	/*return: 'i' if sequence is initially increasing,
	**'d' if it's initially decreasing*/
	private static char initialDirection(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] == arr[i-1]) {
				continue;
			} else {
				if(arr[i] > arr[i-1])
					return 'i';//array elements are initially increasing
				else
					return 'd';//array elements are initially decreasing
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Program running");
		
		int[] sample = {1,2,3,1,0};
		if(hasInflectionPoint(sample)) {
			System.out.println("index: "+findIndex(sample));
		}
		
		
		System.out.println("Program finished");
	}
}