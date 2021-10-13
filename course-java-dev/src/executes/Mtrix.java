package executes;

public class Mtrix {

	public static void main(String[] args) {

		int[][] grades = new int[2][4];
		
		grades[0][0] = 80;
		grades[0][1] = 90;
		grades[0][2] = 70;
		grades[0][3] = 65;
		
		grades[1][0] = 56;
		grades[1][1] = 40;
		grades[1][2] = 50;
		grades[1][3] = 80;
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println("--------------------");
			System.out.println("Matrix "+(i+1));
		
			for(int j = 0; j < grades[i].length; j++) {
				System.out.println("Row "+i+ " column "+j +": "+grades[i][j]);
			}
			
		}
		
		
	}

}
