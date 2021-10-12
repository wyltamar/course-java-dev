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
		
	}

}
