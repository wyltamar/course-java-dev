package classes;

public class Director extends Person {
	
	private String educationRecord;
	private int diretionTime;
	private String titulation;
	
	
	public String getEducationRecord() {
		return educationRecord;
	}
	public void setEducationRecord(String educationRecord) {
		this.educationRecord = educationRecord;
	}
	public int getDiretionTime() {
		return diretionTime;
	}
	public void setDiretionTime(int diretionTime) {
		this.diretionTime = diretionTime;
	}
	public String getTitulation() {
		return titulation;
	}
	public void setTitulation(String titulation) {
		this.titulation = titulation;
	}
	@Override
	public String toString() {
		return "Director [educationRecord=" + educationRecord + ", diretionTime=" + diretionTime + ", titulation="
				+ titulation + ", name=" + name + ", age=" + age + ", birthDate=" + birthDate + ", generalRecord="
				+ generalRecord + ", cpfNumber=" + cpfNumber + ", matherName=" + matherName + ", fatherName="
				+ fatherName + "]";
	}
	
	

}
