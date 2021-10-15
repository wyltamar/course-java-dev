package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScreenTimeThread extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descriptionHour = new JLabel("Time Thread 1");
	private JTextField timeThread = new JTextField();
	
	private JLabel descriptionHour2 = new JLabel("Time Thread 2");
	private JTextField timeThread2 = new JTextField();
	
	public ScreenTimeThread() {
		
		setTitle("My screen with thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*First part finalized*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		
		descriptionHour.setPreferredSize(new Dimension(200,25));
		jPanel.add(descriptionHour, gridBagConstraints);
		
		timeThread.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(timeThread, gridBagConstraints);
		
		descriptionHour2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(descriptionHour2, gridBagConstraints);
		
		timeThread2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(timeThread2, gridBagConstraints);
		
		
		add(jPanel, BorderLayout.WEST);
		/*Will Allways be the last comand */
		setVisible(true);
	}

}
