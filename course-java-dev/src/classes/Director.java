package classes;

import interfaces.AllowAccess;

public class Director extends Person implements AllowAccess {
	
	private String educationRecord;
	private int diretionTime;
	private String titulation;
	
	private String login;
	private String password;
	
	public Director() {
		
	}
	
	public Director(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
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
	
	@Override
	public  double getWage(){
	    return 4200.00 + (4200 * 0.05 );
	}
	@Override
	public boolean autenticate(String login, String password) {
		this.login = login;
		this.password = password;
		return autenticate();
	}
	@Override
	public boolean autenticate() {
		
		return login.equals("wyl") && password.equals("123");
	}

}
