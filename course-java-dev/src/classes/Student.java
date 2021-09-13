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
	
	

}
