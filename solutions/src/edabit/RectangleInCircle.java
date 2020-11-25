package edabit;

public class RectangleInCircle {
	public static boolean rectangleInCircle(int w, int h, int radius) {
		
		double wSquare = Math.pow(w, 2);
		double hSquare = Math.pow(h, 2);
		
		double squareRoot = Math.sqrt(wSquare+hSquare);
		int diameter =  radius*2;
		
		if (squareRoot > diameter ) {
			return false;
		}
		else {
			return true;
		}

	}
	
	public static void main(String[] args) {
		
		System.out.println(rectangleInCircle(5, 12, 6));
		
	}

}
