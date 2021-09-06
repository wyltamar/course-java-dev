package executes;

import javax.swing.JOptionPane;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {
		
		/*Creating a confirmation option */ 
		
		int cars = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of cars: "));
		int persons = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of persons: "));
		
		int division = cars / persons;
		int rest = cars % persons;
		
		int answer = JOptionPane.showConfirmDialog(null, "Do you want to see the result of the split?");
		
		if(answer == 0) {
			
			JOptionPane.showMessageDialog(null, "The division result is: "+division);
		}else {
			JOptionPane.showMessageDialog(null, "User don't have want seen the result of the division!");
		}
		
		answer = JOptionPane.showConfirmDialog(null, "Do you want to see the rest of the split?");
		
		if(answer == 0) {
			JOptionPane.showMessageDialog(null, "The rest of the division is: "+rest);
		}else {
			JOptionPane.showMessageDialog(null, "User don't have want seen the rest of the division!");
		}
		

	}

}
