package executes;

import javax.swing.JOptionPane;

import classes.Student;

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
		double grade1 = Double.parseDouble(JOptionPane.showInputDialog("Enter with grade 1:"));
		double grade2 = Double.parseDouble(JOptionPane.showInputDialog("Enter with grade 2:"));
		double grade3 = Double.parseDouble(JOptionPane.showInputDialog("Enter with grade 3:"));
		double grade4 = Double.parseDouble(JOptionPane.showInputDialog("Enter with grade 4:"));
		
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
		student4.setGrade1(grade1);
		student4.setGrade2(grade2);
		student4.setGrade3(grade3);
		student4.setGrade4(grade4);
		
		System.out.println(student4.toString());
		System.out.println("Student average: "+student4.getStudentAverage());
		System.out.println("Result: "+(student4.getApprovedStudent()? "Approved" : "Anapproved"));
		
	}

}
