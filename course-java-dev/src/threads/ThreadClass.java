package threads;

import javax.swing.JOptionPane;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void run() {
				
				for(int i = 0; i < 10; i++) {
					System.out.println("Sending email...");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			};
			
		}.start();
		
		/*Competitors threads*/
		public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void run() {
				
				for(int i = 0; i < 10; i++) {
					System.out.println("Sending invoice...");
					
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			};
			
		}.start();
		
		

		
		
		System.out.println("Finishing code exucute");
		JOptionPane.showMessageDialog(null, "Finished program!");
	}

}
