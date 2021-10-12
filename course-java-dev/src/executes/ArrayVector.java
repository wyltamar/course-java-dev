package executes;

import javax.swing.JOptionPane;

public class ArrayVector {

	public static void main(String[] args) {

		int notes = Integer.parseInt(JOptionPane.showInputDialog("How many positions should the Array have?")); 
		
		double [] grades = new double[notes];
		
		
		for(int i = 0; i < grades.length; i++) {
			
			grades[i] = Double.parseDouble(JOptionPane.showInputDialog("Inform the grade "+(i+1)));
		}
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println("Grade "+(i + 1)+" = "+grades[i]);
		}
		
	}

}
