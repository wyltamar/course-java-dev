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
	
	private JLabel descriptionHour = new JLabel("Time Thread 1");
	private JTextField timeThread = new JTextField();
	
	private JLabel descriptionHour2 = new JLabel("Time Thread 2");
	private JTextField timeThread2 = new JTextField();
	
	private JButton btn1 = new JButton("Start");
	private JButton btn2 = new JButton("Stop");
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			while(true) {
				timeThread.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss")
						.format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {

			while(true) {
				timeThread2.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm:ss")
						.format(Calendar.getInstance().getTime()));
				
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	};
	
	private Thread threadTime1;
	private Thread threadTime2;
	
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
		timeThread.setEditable(false);
		jPanel.add(timeThread, gridBagConstraints);
		
		descriptionHour2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(descriptionHour2, gridBagConstraints);
		
		timeThread2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		timeThread2.setEditable(false);
		jPanel.add(timeThread2, gridBagConstraints);
		
		gridBagConstraints.gridwidth = 1;
		
		btn1.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(btn1, gridBagConstraints);
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				threadTime1 = new Thread(thread1);
				threadTime2 = new Thread(thread2);
				threadTime1.start();
				threadTime2.start();
				btn1.setEnabled(false);
				btn2.setEnabled(true);
			}
		});
		
		btn2.setEnabled(false);
		btn2.setPreferredSize(new Dimension(92,25));
		gridBagConstraints.gridx ++;
		jPanel.add(btn2, gridBagConstraints);
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				threadTime1.stop();
				threadTime2.stop();
				btn2.setEnabled(false);
				btn1.setEnabled(true);
				
			}
		});
		
		add(jPanel, BorderLayout.WEST);
		/*Will Allways be the last comand */
		setVisible(true);
	}

}
