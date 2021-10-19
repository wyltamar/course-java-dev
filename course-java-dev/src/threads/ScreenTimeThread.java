package threads;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScreenTimeThread extends JDialog{
	
	private JPanel jPanel = new JPanel(new GridBagLayout());
	
	private JLabel descriptionHour = new JLabel("Nome");
	private JTextField timeThread = new JTextField();
	
	private JLabel descriptionHour2 = new JLabel("Email");
	private JTextField timeThread2 = new JTextField();
	
	private JButton btn1 = new JButton("Add");
	private JButton btn2 = new JButton("Stop");
	
	
	private ThreadQueueImplementation queue = new ThreadQueueImplementation();
	
	
	
	public ScreenTimeThread() {
		
		setTitle("My screen with thread");
		setSize(new Dimension(240,240));
		setLocationRelativeTo(null);
		setResizable(false);
		/*First part finalized*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST;
		
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
		
		gridBagConstraints.gridwidth = 1;
		
		btn1.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(btn1, gridBagConstraints);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ThreadQueueObject object = new ThreadQueueObject();
				object.setName(timeThread.getText());
				object.setEmail(timeThread2.getText());
				
				
				queue.add(object);
			}
		});
		
		btn2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jPanel.add(btn2, gridBagConstraints);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
			}
		});
		
		queue.start();
		add(jPanel, BorderLayout.WEST);
		/*Will Allways be the last comand */
		setVisible(true);
	}

}
