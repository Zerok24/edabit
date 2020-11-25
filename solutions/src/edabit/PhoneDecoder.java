package edabit;

public class PhoneDecoder {
	public static String textToNum(String phone) {
		
		String[] table = new String[] { "", "", "ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"  }; 
		String number = "";
		
		for (int i = 0; i < phone.length(); i++) {
			
			if (Character.isLetter(phone.charAt(i))) {
				
				for (int j = 0; j < table.length; j++) {
					if (table[j].contains(String.valueOf(phone.charAt(i)))) {
						number+= String.valueOf(j);
					}
				}
				
			}else {
				number += phone.charAt(i);
			}
		}
		
		return number;

	}
	
	public static void main(String[] args) {
		
		System.out.println(textToNum("(325)444-TEST"));
		
	}

}
