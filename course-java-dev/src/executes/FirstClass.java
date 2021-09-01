package executes;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		double grade1 = 10;
		double grade2 = 80;
		double grade3 = 10;
		double grade4 = 100;
		double average = 0;

		average = (grade1 + grade2 + grade3 + grade4) / 4;

		/* Logical condition with IF and ELSE */
		/*
		 * if(average >= 70) { System.out.println("Approved: "+average); } else
		 * if(average >= 40 && average <= 69) {
		 * System.out.println("Student recovering: "+average); } else {
		 * System.out.println("Disapproved: "+average); }
		 */

		/* Ternary operators */

		String outputResultStudent = average >= 70 ? "Approved student" : (average >= 40 && average <= 69) ? "Recovering student" : "Disapproved Student" ;
		System.out.println(outputResultStudent);

	}

}
