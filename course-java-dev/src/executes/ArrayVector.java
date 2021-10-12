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
			
			double maxGrade = 0.0;
			double minGrade = 100.0;
			
			System.out.println("Student's subject: "+sub.getSubject());
			for(int i = 0 ; i < sub.getGrade().length; i++) {
				System.out.println("Subject "+(i+1)+": "+sub.getGrade()[i]);
				
				if(i == 0) {
					maxGrade = sub.getGrade()[i];
					minGrade = sub.getGrade()[i];
				}else {
					if(sub.getGrade()[i] > maxGrade) {
						maxGrade = sub.getGrade()[i];
					}
					if(sub.getGrade()[i] < minGrade) {
						minGrade = sub.getGrade()[i];
					}
				}
				
			}
				System.out.println("The largest grade of subject "+sub.getSubject()+" is: "+maxGrade);
				System.out.println("The shortest grade of subject "+sub.getSubject()+" is: "+minGrade);
		}
		
	}

}
