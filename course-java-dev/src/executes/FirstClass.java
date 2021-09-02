package executes;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {
		
		int number = 0, number2 = 0;
		
		
		/*Check then run*/
		while (number <= 10) {
			System.out.println("The present number is: "+number);
			number++;
		}
		
		do {
			System.out.println("The present number is: "+number2);
			number2++;
		} while (number2 <= 5);
		
	}

}
