package executes;

import javax.swing.JOptionPane;

import classes.Student;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		Student student1 = new Student("Wyltamar");
		System.out.println("The name of student 1 is: "+student1.getName());
		
		Student student2 = new Student();
		student2.setName("Wyltamar Douglas de Sousa Oliveira"); 
		System.out.println("The name of student 2 is: "+student2.getName());
		
		Student student3 = new Student("Wyltamar Oliveira", 38, "02/05/1983","244566");
		System.out.println("==============================================");
		System.out.println("Name: "+student3.getName()+ "\n"+"Age: "+student3.getAge()+"\n"+"Birth Day: "+student3.getBirthDate());
		System.out.println("General record: "+student3.getGeneralRecord());
		System.out.println("==============================================");
		
		Student student4 = new Student();
		student4.setName("Pedro Lucas");
		student4.setAge(12);
		student4.setBirthDate("28-01-2010");
		student4.setGeneralRecord("2553278");
		student4.setCpfNumber("123.567.098-02");
		student4.setMatherName("Amanda de Almeida Gonçalves");
		student4.setFatherName("Wyltamar Douglas de Sousa Oliveira");
		student4.setEnrollmentDate("05-02-2021");
		student4.setSchoolName("Escola Alegria do Saber");
		student4.setSeriesEnrollment("5º ano");
		student4.setGrade1(80);
		student4.setGrade2(90);
		student4.setGrade3(100);
		student4.setGrade4(100);
		
		System.out.println("Name Student 4: "+student4.getName());
		System.out.println("Student age: "+student4.getAge());
		System.out.println("BirthDay: "+student4.getBirthDate());
		System.out.println("Student's average: "+student4.getStudentAverage());
		System.out.println("Did the student pass? "+(student4.getApprovedStudent()? "Approved" : "Anapproved"));
		
	}

}
