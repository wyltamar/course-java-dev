package threads;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadQueueImplementation extends Thread {

	private static ConcurrentLinkedQueue<ThreadQueueObject> pile_queue = 
							new ConcurrentLinkedQueue<ThreadQueueObject>();
	
	
	public static void add(ThreadQueueObject threadQueueObject) {
		pile_queue.add(threadQueueObject);
	}
	
	@Override
	public void run() {

		Iterator iteration = pile_queue.iterator();
		
		synchronized(iteration) { //block access to this list by other processes
			
			while(iteration.hasNext()) { //while it's on the list it will process
				
				ThreadQueueObject process = (ThreadQueueObject) iteration.next(); //take the current object
				
				/*Process anything*/
				/*For example send email */
				/*For example send invoice */
				/*For example send pdf */
				
				System.out.println("------------------------------");
				
				System.out.println(process.getEmail());
				System.out.println(process.getName());
				
				iteration.remove();
				
				try {
					Thread.sleep(100); // Give time to unload memory
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
				
			}
		}
		
		try {
			Thread.sleep(1000); // Processed the entire list give time to clear memory
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
