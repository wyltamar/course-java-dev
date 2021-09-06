package executes;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {
		
		/*Repeating structure FOR with break */ 
		
		for(int number = 0; number <= 10; number++) {
			if(number == 3 || number == 6 || number == 9) {
				
				System.out.println("I found the number: "+number);
				System.out.println("I'm runing...");
				continue;
			}
			System.out.println("Looking for number...");
		}

	}

}
