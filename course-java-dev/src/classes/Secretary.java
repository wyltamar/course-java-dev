package classes;

import interfaces.AllowAccess;

public class Secretary extends Person implements AllowAccess {
	
	private String record;
	private String officeLevel;
	private String experience;
	
	private String login;
	private String password;
	
	public Secretary(String login, String password) {
		this.login = login;
		this.password = password;
	}
	
	public Secretary() {
		
	}
	
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
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public boolean autenticate(String login, String password) {
		this.login = login;
		this.password = password;
		return autenticate();
	}

	@Override
	public boolean autenticate() {

		return login.equals("admin") && password.equals("admin");
	}
	
	
	
	
}
