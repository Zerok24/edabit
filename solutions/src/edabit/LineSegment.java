package edabit;

public class LineSegment {
	  public static double lineLength(int[][] point) {
			
		  return Math.sqrt( Math.pow(( point[0][0]- point[1][0] ), 2.0) 
				  + Math.pow(( point[0][1]- point[1][1] ), 2.0) 
				  + Math.pow(( point[0][2]- point[1][2] ), 2.0) );
		  
		  
	  }

}
