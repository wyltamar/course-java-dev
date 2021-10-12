package executes;

public class ArrayVector {

	public static void main(String[] args) {

		double [] grades = new double[4];
		
		grades[0] = 9.8;
		grades[1] = 7.8;
		grades[2] = 8.0;
		grades[3] = 9.0;
		
		for(int i = 0; i < grades.length; i++) {
			
			System.out.println("Note "+(i + 1)+" = "+grades[i]);
		}
		
		for(double i : grades) {
			System.out.println("grade  = "+i);
		}
		
	}

}
