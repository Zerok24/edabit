package edabit;

import java.util.ArrayList;
import java.util.List;


public class UniqueElements {
	public static boolean same(int[] a1, int[] a2) {
		
		List<Integer> newA1 = new ArrayList<Integer>();
		List<Integer> newA2 = new ArrayList<Integer>();
		
		for (int i = 0; i <a1.length; i++) {
			if (!newA1.contains(a1[i]) ) {
				newA1.add(a1[i]);
			}
		}
		
		for (int i = 0; i <a2.length; i++) {
			if (!newA2.contains(a2[i]) ) {
				newA2.add(a2[i]);
			}
		}
		
		
		if (newA1 == newA2) {
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
