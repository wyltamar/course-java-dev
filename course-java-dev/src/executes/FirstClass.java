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
		Subject subjects = new Subject();
		
		for(int i = 0; i <= 3; i++ ) {
			String subject = JOptionPane.showInputDialog("Enter with subject "+i);
			subjects.setSubject(subject);
			double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter with grade: "+i));
			subjects.setGrade(grade);
			
			student4.getSubjects().add(subjects);
		}
		
		
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
		
		
		
		System.out.println(student4.toString());
		System.out.println("Student average: "+student4.getStudentAverage());
		System.out.println("Result: "+(student4.getApprovedStudent()? "Approved" : "Anapproved"));
		
	}

}
