package executes;

import classes.Student;
import classes.Subject;

public class ArrayVector {

	public static void main(String[] args) {
		
		double[] javaGrades = {9.0,10.0,7.8,8.4};
		double[] logicaGrades = {80.0,90,7.8,8.4};

		Student student = new Student();
		student.setName("Wyltamar Dougals");
		student.setSchoolName("JDEV Treinamentos");
		
		Subject subject = new Subject();
		subject.setSubject("Java");
		subject.setGrade(javaGrades);
		
		student.getSubjects().add(subject);
		
		Subject subject2 = new Subject();
		subject2.setSubject("Lógica");
		subject2.setGrade(logicaGrades);
		
		student.getSubjects().add(subject2);
		
		System.out.println("------------Datas of student-----------");
		System.out.println("Name: "+student.getName()+ "enrollment on "+student.getSchoolName());
		System.out.println("=============Subjects names ===========");
		
		for(Subject sub: student.getSubjects()) {
			
			System.out.println("Student's subject: "+sub.getSubject());
			for(int i = 0 ; i < sub.getGrade().length; i++) {
				System.out.println("Subject "+(i+1)+": "+sub.getGrade()[i]);
			}
		}
		
	}

}
