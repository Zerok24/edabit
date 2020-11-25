package edabit;

public class arrayOfMultiples {
	public static int[] arrayOfMultiples(int num, int length) {
		
		int[] multiples = new int[length];
		
		multiples[0] = num;
		
		for (int i = 1; i <length; i++) {
			multiples[i] = multiples[i-1] + num ;
			
		}
		
		return multiples;
		
	}

}
