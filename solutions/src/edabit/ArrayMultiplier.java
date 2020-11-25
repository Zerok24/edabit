package edabit;

public class ArrayMultiplier {
	public static Object[][] multiply(Object[] items) {
		
		Object[][] array2 = new Object[items.length][items.length];
		
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length; j++) {
				array2[i][j] = items[i];
			}
			
		}
		
		return array2;
		
	}
}
