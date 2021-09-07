package executes;

import javax.swing.JOptionPane;

import classes.Student;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		Student student1 = new Student("Wyltamar");
		System.out.println("The name of student 1 is: "+student1.name);
		
		Student student2 = new Student();
		student2.name = "Wyltamar Douglas de Sousa Oliveira";
		System.out.println("The name of student 2 is: "+student2.name);
		
		Student student3 = new Student("Wyltamar Oliveira", 38, "02/05/1983");
		
		System.out.println("Name: "+student3.name+ "\n"+"Age: "+student3.age+"\n"+"Birth Day: "+student3.birthDate);
		
		
	}

}
