package executes;

import javax.swing.JOptionPane;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {
		
		/*Data input with class JoptionPane */ 
		
		int cars = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of cars: "));
		int persons = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of persons: "));
		
		int division = cars / persons;
		int rest = cars % persons;
		
		JOptionPane.showMessageDialog(null, "The division is "+division+ " car for each person and " +rest + " car(s) left.");

	}

}
