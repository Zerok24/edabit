package edabit;

public class BirthdayCake {
	
	public static String[] getBirthdayCake(String name,int age) {
		
		boolean isEven = false;
		String nuevoString = "";
		String symbolString = "";
		
		if (age %2 == 0) {
			isEven = true;
		}
		
		if (!isEven) {
			 nuevoString = String.format("* %d Happy Birthday %s! %d *", age,name,age);
		}
		else {
			 nuevoString = String.format("# %d Happy Birthday %s! %d #", age,name,age);
		}
		
		
		for (int i = 0; i < nuevoString.length() ; i++) {
			if (isEven) {
				symbolString += "#";
			}
			else {
				symbolString += "*";
			}
		}
		
		String [] arraysString  = {symbolString, nuevoString, symbolString}; 
		
		return arraysString;
		
		
	}

}
