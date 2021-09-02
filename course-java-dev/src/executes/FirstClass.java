package executes;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {
		
		/*
		double grade1 = 100;
		double grade2 = 80;
		double grade3 = 100;
		double grade4 = 100;
		double average = 0;

		average = (grade1 + grade2 + grade3 + grade4) / 4;

		/*Logical operators nested*/
		
		/*if(average >= 50) {
			if(average >= 70) {
				System.out.println("Direct approved student");
			}else {
				System.out.println("Student is recovering");
			}
		}else {
			System.out.println("Direct repproved student");
		} */
		
		/*SWICH CASE*/
		
		int day = 7;
		
		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
			
		case 2:
			System.out.println("Monday");
			break;

		case 3:
			System.out.println("Tuesday");
			break;
		
		case 4:
			System.out.println("Wednesday");
			break;
			
		case 5:
			System.out.println("Thursday");
			break;

		case 6:
			System.out.println("Friday");
			break;

		case 7:
			System.out.println("Saturday");
			break;
	
		default:
			System.out.println("Invalid day");
			break;
		}
		
	}

}
