package classes;

public class Student {
	
	public String name;
	public int age;
	public String birthDate;
	String generalRecord;
	String cpfNumber;
	String matherName;
	String fatherName;
	String enrollmentDate;
	String schoolName;
	String seriesEnrollment;
	
	/*About object constructor*/
	
	/*Default builder*/
	public Student() {
		
	}
	
	public Student(String defaultName) {
		name = defaultName;
	}
	
	public Student(String defaultName, int defaultAge, String defaultBirthDate) {
		name = defaultName;
		age = defaultAge;
		birthDate = defaultBirthDate;
	}

}
