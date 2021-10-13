package executes;

import classes.Student;
import classes.Subject;

public class ArrayVector {

	public static void main(String[] args) {
		
		double[] javaGrades = {90,100,78,84};
		double[] logicaGrades = {80,90,78,84};
		double[] javaScriptGrades = {56,70,80,95};
		double[] bdGrades = {100,80,70,65};

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
		
		Student student2 = new Student();
		student2.setName("João Moura");
		student2.setSchoolName("JDEV Treinamentos");
		
		Subject subject3 = new Subject();
		subject3.setSubject("JavaScript");
		subject3.setGrade(javaScriptGrades);
		
		student2.getSubjects().add(subject3);
		
		Subject subject4 = new Subject();
		subject4.setSubject("Banco de dados");
		subject4.setGrade(bdGrades);
		
		//=======================================================================
		
		Student [] arrayStudents = new Student[2];
		arrayStudents[0] = student;
		arrayStudents[1] = student2;
		
		System.out.println("------------Datas Student-----------------");
		for(int i = 0; i < arrayStudents.length; i++) {
			System.out.println("Student name: "+arrayStudents[i].getName());
			System.out.println("=======================================");
			
			for(Subject sub : arrayStudents[i].getSubjects()) {
				System.out.println("Subject: "+sub.getSubject());
				
				for(int j = 0; j < sub.getGrade().length; j++) {
					
					System.out.println("Grade "+(j+1)+": "+sub.getGrade()[j]);
				}
				System.out.println("-------------------------------------");
			}
		}
	}

}
