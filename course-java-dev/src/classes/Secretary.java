package classes;

public class Secretary extends Person {
	
	private String record;
	private String officeLevel;
	private String experience;
	
	public String getRecord() {
		return record;
	}
	public void setRecord(String record) {
		this.record = record;
	}
	public String getOfficeLevel() {
		return officeLevel;
	}
	public void setOfficeLevel(String officeLevel) {
		this.officeLevel = officeLevel;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Secretary [record=" + record + ", officeLevel=" + officeLevel + ", experience=" + experience + ", name="
				+ name + ", age=" + age + ", birthDate=" + birthDate + ", generalRecord=" + generalRecord
				+ ", cpfNumber=" + cpfNumber + ", matherName=" + matherName + ", fatherName=" + fatherName + "]";
	}
	
	@Override
	public double getWage(){
	   return 1500.00;
	}
	
	
	
}
