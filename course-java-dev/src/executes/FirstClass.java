package executes;

import javax.swing.JOptionPane;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		/*Creating the class the student - average calculate */

		double note1 = Double.parseDouble(JOptionPane.showInputDialog("Inform note 1:"));
		double note2 = Double.parseDouble(JOptionPane.showInputDialog("Inform note 2:"));
		double note3 = Double.parseDouble(JOptionPane.showInputDialog("Inform note 3:"));
		double note4 = Double.parseDouble(JOptionPane.showInputDialog("Inform note 4:"));

		double avarege = (note1 + note2 + note3 + note4) / 4;

		if (avarege >= 50) {

			if (avarege >= 70) {
				JOptionPane.showMessageDialog(null, "Student approved with avarege: " + avarege);
			} else {
				JOptionPane.showMessageDialog(null, "Student in recovery with avarege: " + avarege);
			}
		} else {
			JOptionPane.showMessageDialog(null, "Student failed with avarege: " + avarege);
		}

	}

}
