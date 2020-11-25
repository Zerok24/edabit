package edabit;

public class Ending {
	public static boolean checkEnding(String str1, String str2) {
		
		str1 = str1.substring(str1.length() - str2.length());
	    
		if (str1.equals(str2)) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
