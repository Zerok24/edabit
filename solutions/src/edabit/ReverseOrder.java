package edabit;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrder {
	
	public static String reverse(final String str) {
		
		String reverseString = "";
		List<Character> letters = new ArrayList<Character>();
		    
		for (int i = 0; i < str.length(); i++) {
			letters.add(str.charAt(i));
		}
		
		for (int i = letters.size()-1; i >=0; i--) {
			
			reverseString += letters.get(i);
		}
		
		return reverseString;
		
	}

}
