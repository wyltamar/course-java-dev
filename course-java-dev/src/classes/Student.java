package classes;

import java.util.ArrayList;
import java.util.List;

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
	
	
	private List<Subject> subjects = new ArrayList<Subject>();
	
	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	public List<Subject> getSubjects() {
		return subjects;
	}
	
	
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

		public double getStudentAverage() {
		return 0;
	}
	
	public boolean getApprovedStudent() {
		double average = this.getStudentAverage();
		
		if(average >= 70) return true;
		else return false;
	}

	
	
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", birthDate=" + birthDate + ", generalRecord="
				+ generalRecord + ", cpfNumber=" + cpfNumber + ", matherName=" + matherName + ", fatherName="
				+ fatherName + ", enrollmentDate=" + enrollmentDate + ", schoolName=" + schoolName
				+ ", seriesEnrollment=" + seriesEnrollment + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpfNumber == null) ? 0 : cpfNumber.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (cpfNumber == null) {
			if (other.cpfNumber != null)
				return false;
		} else if (!cpfNumber.equals(other.cpfNumber))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	

}
