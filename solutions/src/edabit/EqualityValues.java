package edabit;

public class EqualityValues {
	public static int equal(int a, int b, int c) {
		
		int counter = 0;
		
		if (a==b) {
			counter++;
		}else if (b == c) {
			counter++;
		}else if ( a ==c) {
			counter++;
		}
			
		return counter;
		
		
	}

}
