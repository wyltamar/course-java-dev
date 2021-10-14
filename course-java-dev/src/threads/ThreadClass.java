package threads;

import javax.swing.JOptionPane;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread threadInvoice = new Thread(thread2);
		threadInvoice.start();

		System.out.println("Finishing code exucute");
		JOptionPane.showMessageDialog(null, "Finished program!");
	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {

			for (int i = 0; i < 10; i++) {
				System.out.println("Sending email...");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};

	private static Runnable thread2 = new Runnable() {

		@Override
		public void run() {

			for (int i = 0; i < 10; i++) {
				System.out.println("Sending invoice...");

				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	};

}
