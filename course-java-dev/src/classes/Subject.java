package classes;

import java.util.Arrays;

public class Subject {

	private String subject;
	private double[] grade = new double[4];
	
	public Subject() {
		
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	public double[] getGrade() {
		return grade;
	}

	public void setGrade(double[] grade) {
		this.grade = grade;
	}
	
	public double averageGrade() {
		double totalAdition = 0.0;
		
		for(int i = 0; i < grade.length; i++) {
			
			totalAdition += grade[i];
		}
		
		return totalAdition / grade.length;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(grade);
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
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
		Subject other = (Subject) obj;
		if (!Arrays.equals(grade, other.grade))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + ", grade=" + Arrays.toString(grade) + "]";
	}

	

}
