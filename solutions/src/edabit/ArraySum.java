package edabit;

public class ArraySum {
	public static int sum(int[] arr) {
		
		int result = 0;
		int n = arr.length;
		
		if (arr.length == 0) {
			return result;
		}
		else {
			result+= arr[n-1];
//			sum(arr -1);
		}
		return 0;

	}
	
}
