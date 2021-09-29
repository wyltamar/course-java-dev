package executes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import classes.Student;
import classes.Subject;
import statics.StudentStatus;


public class FirstClass {

	/* Main is a method auto execute in Java */
	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();
		List<Student> approvedStudents = new ArrayList<Student>();
		List<Student> recoveryStudents = new ArrayList<Student>();
		List<Student> disapprovedStudents = new ArrayList<Student>();

		for (int qnt = 0; qnt <= 4; qnt++) {

			Student student4 = new Student();

			String name = JOptionPane.showInputDialog("Enter student " + (qnt + 1) );
			student4.setName(name);

			/*
			 * int age = Integer.parseInt(JOptionPane.showInputDialog("Enter age:"));
			 * student4.setAge(age);
			 * 
			 * 
			 * String birthDate = JOptionPane.showInputDialog("Enter birth date:");
			 * student4.setBirthDate(birthDate);
			 * 
			 * String generalRecord = JOptionPane.showInputDialog("Enter General Record: ");
			 * student4.setGeneralRecord(generalRecord);
			 * 
			 * String cpfNumber = JOptionPane.showInputDialog("Enter CPF number:");
			 * student4.setCpfNumber(cpfNumber);
			 * 
			 * String matherName = JOptionPane.showInputDialog("Enter wiht mather name:");
			 * student4.setMatherName(matherName);
			 * 
			 * String fatherName = JOptionPane.showInputDialog("Enter wiht father name:");
			 * student4.setFatherName(fatherName);
			 * 
			 * String enrollmentDate =
			 * JOptionPane.showInputDialog("Enter with enrollment date:");
			 * student4.setEnrollmentDate(enrollmentDate);
			 * 
			 * String schoolName = JOptionPane.showInputDialog("Enter School name:");
			 * student4.setSchoolName(schoolName);
			 * 
			 * String seriesEnrollment = JOptionPane.showInputDialog("Enter series:");
			 * student4.setSeriesEnrollment(seriesEnrollment);
			 */

			for (int i = 0; i < 1; i++) {

				Subject subjects = new Subject();

				String subject = JOptionPane.showInputDialog("Enter with subject " + (i + 1));
				subjects.setSubject(subject);

				double grade = Double.parseDouble(JOptionPane.showInputDialog("Enter with grade: " + (i + 1)));
				subjects.setGrade(grade);

				student4.getSubjects().add(subjects);
			}

			int choice = JOptionPane.showConfirmDialog(null, "Do you want delete any subject ?");

			if (choice == 0) {

				int removeContinue = 0;

				while (removeContinue == 0) {

					int position = 1;

					int optionUser = Integer
							.parseInt(JOptionPane.showInputDialog("Enter with number of subject: 1, 2"));
					student4.getSubjects().remove(optionUser - position);
					position++;

					removeContinue = JOptionPane.showConfirmDialog(null, "Do you want delete other subject?");
				}
			}

			students.add(student4);

		}
		
		for(Student student : students) {
			
			if(student.getApprovedStudent().equalsIgnoreCase(StudentStatus.APPROVED)) {
				approvedStudents.add(student);
			}
			else if(student.getApprovedStudent().equalsIgnoreCase(StudentStatus.RECOVERY)) {
				recoveryStudents.add(student);
			}
			else {
				disapprovedStudents.add(student);
			}
			
		}
		
		System.out.println("---------------Approved List-----------------------");
		for (Student student2 : approvedStudents) {
			System.out.println("Name: "+student2.getName());
			System.out.println("Result: "+student2.getApprovedStudent()+ " with average: "+student2.getStudentAverage());
		}
		
		System.out.println("---------------Recovery List-----------------------");
		for (Student student3 : recoveryStudents) {
			System.out.println("Name: "+student3.getName());
			System.out.println("Result: "+student3.getApprovedStudent()+ " with average: "+student3.getStudentAverage());
		}
		
		System.out.println("---------------Disapproved List-----------------------");
		for (Student student4 : disapprovedStudents) {
			System.out.println("Name: "+student4.getName());
			System.out.println("Result: "+student4.getApprovedStudent()+ " with average: "+student4.getStudentAverage());
		}
		
	}

}
