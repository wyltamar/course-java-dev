package executes;

import javax.swing.JOptionPane;

import classes.Student;
import classes.Subject;

public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Enter name:");
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:")); 
		String birthDate = JOptionPane.showInputDialog("Enter birth date:");
		String generalRecord = JOptionPane.showInputDialog("Enter General Record: ");
		String cpfNumber = JOptionPane.showInputDialog("Enter CPF number:");
		String matherName = JOptionPane.showInputDialog("Enter wiht mather name:");
		String fatherName = JOptionPane.showInputDialog("Enter wiht father name:");
		String enrollmentDate = JOptionPane.showInputDialog("Enter with enrollment date:");
		String schoolName = JOptionPane.showInputDialog("Enter School name:");
		String seriesEnrollment = JOptionPane.showInputDialog("Enter series:");
		
		
		Student student4 = new Student();
		
		student4.setName(name);
		student4.setAge(age);
		student4.setBirthDate(birthDate);
		student4.setGeneralRecord(generalRecord);
		student4.setCpfNumber(cpfNumber);
		student4.setMatherName(matherName);
		student4.setFatherName(fatherName);
		student4.setEnrollmentDate(enrollmentDate);
		student4.setSchoolName(schoolName);
		student4.setSeriesEnrollment(seriesEnrollment);
		
		Subject subject1 = new Subject();
		subject1.setSubject("Banco de dados");
		subject1.setGrade(95);
		
		student4.getSubjects().add(subject1);
		
		Subject subject2 = new Subject();
		subject2.setSubject("Matemática");
		subject2.setGrade(80);

		student4.getSubjects().add(subject2);
		
		Subject subject3 = new Subject();
		subject3.setSubject("Java");
		subject3.setGrade(100);
		
		student4.getSubjects().add(subject3);
		
		Subject subject4 = new Subject();
		subject4.setSubject("Spring");
		subject4.setGrade(85);
		
		student4.getSubjects().add(subject4);
		
		System.out.println(student4.toString());
		System.out.println("Student average: "+student4.getStudentAverage());
		System.out.println("Result: "+(student4.getApprovedStudent()? "Approved" : "Anapproved"));
		
	}

}
