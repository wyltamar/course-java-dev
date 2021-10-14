package threads;

import java.awt.Dimension;

import javax.swing.JDialog;

public class ScreenTimeThread extends JDialog{
	
	public ScreenTimeThread() {
		
		setTitle("My screen with thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*First part finalized*/
		
		
		/*Will Allways be the last comand */
		setVisible(true);
	}

}
