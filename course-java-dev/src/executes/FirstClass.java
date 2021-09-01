package executes;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		double grade1 = 100;
		double grade2 = 80;
		double grade3 = 100;
		double grade4 = 100;
		double average = 0;

		average = (grade1 + grade2 + grade3 + grade4) / 4;

		/*Logical operators nested*/
		
		if(average >= 50) {
			if(average >= 70) {
				System.out.println("Direct approved student");
			}else {
				System.out.println("Student is recovering");
			}
		}else {
			System.out.println("Direct repproved student");
		}
	}

}
