package edabit;

public class DuplicateCharacters {
	public static int duplicates(String str) {
		
		int counter = 0;
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = 0; j < str.length(); j++) {
				
//				char h = "";
//				String nuevoString = str.replaceFirst(str.charAt(i) , h); 
				
				if ( str.charAt(i) == str.charAt(j) ) {
					counter++;
					
				}
				
			}
			counter -= 1;
		}
		
		return counter;

	  }
	
	public static void main(String[] args) {
		
		System.out.println( duplicates("hello world"));
		
	}

}
