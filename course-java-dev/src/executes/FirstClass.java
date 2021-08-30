package executes;

public class FirstClass {
	
	/*Global variable is accessible for all*/
	static int globalOlderAge = 30;
	
	/*Main is a method auto execute in Java*/
	public static void main(String[] args) {
		
		/*Local variable because belongs only to this method*/
		int olderAge = 18;
		
		method2();
		
		System.out.println("Value of local variable is = "+olderAge);

	}
	
	public static void method2() {
		 globalOlderAge ++;
		 System.out.println("Value of global variable is =  "+globalOlderAge);
	}

}
