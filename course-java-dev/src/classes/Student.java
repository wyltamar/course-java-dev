package classes;

public class Student {
	
	private String name;
	private int age;
	private String birthDate;
	private String generalRecord;
	private String cpfNumber;
	private String matherName;
	private String fatherName;
	private String enrollmentDate;
	private String schoolName;
	private String seriesEnrollment;
	private double grade1;
	private double grade2;
	private double grade3;
	private double grade4;
	
	
	/*About object constructor*/
	
	/*Default builder*/
	public Student() {
		
	}
	
	public Student(String defaultName) {
		name = defaultName;
	}
	
	public Student(String defaultName, int defaultAge, String defaultBirthDate, String defaultGeneralRecord) {
		name = defaultName;
		age = defaultAge;
		birthDate = defaultBirthDate;
		generalRecord = defaultGeneralRecord;
	}
	
	//SETTER AND GETTER
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getBirthDate() {
		return this.birthDate;
	}

	public String getGeneralRecord() {
		return generalRecord;
	}

	public void setGeneralRecord(String generalRecord) {
		this.generalRecord = generalRecord;
	}

	public String getCpfNumber() {
		return cpfNumber;
	}

	public void setCpfNumber(String cpfNumber) {
		this.cpfNumber = cpfNumber;
	}

	public String getMatherName() {
		return matherName;
	}

	public void setMatherName(String matherName) {
		this.matherName = matherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSeriesEnrollment() {
		return seriesEnrollment;
	}

	public void setSeriesEnrollment(String seriesEnrollment) {
		this.seriesEnrollment = seriesEnrollment;
	}

	public double getGrade1() {
		return grade1;
	}

	public void setGrade1(double grade1) {
		this.grade1 = grade1;
	}

	public double getGrade2() {
		return grade2;
	}

	public void setGrade2(double grade2) {
		this.grade2 = grade2;
	}

	public double getGrade3() {
		return grade3;
	}

	public void setGrade3(double grade3) {
		this.grade3 = grade3;
	}

	public double getGrade4() {
		return grade4;
	}

	public void setGrade4(double grade4) {
		this.grade4 = grade4;
	}
	
	/*Method responsible for calculating student's average*/
	
	public double getStudentAverage() {
		return (grade1 + grade2 + grade3 + grade4)/4;
	}
	
	public boolean getApprovedStudent() {
		double average = this.getStudentAverage();
		
		if(average >= 70) return true;
		else return false;
	}
	
	

}
