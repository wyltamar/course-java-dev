package executes;

import classes.Director;
import classes.Secretary;
import classes.Student;

public class TestingChildCalsses {
	
	public static void main(String [] args) {
		
		Student student = new Student();
		student.setName("João Filho");
		student.setAge(19);
		student.setMatherName("Maria Livanira");
		
		
		Director director = new Director();
		director.setName("Slvino Alvino");
		director.setTitulation("Pedagogo");
		director.setDiretionTime(5);
		director.setAge(17);
		
		Secretary secretary = new Secretary();
		secretary.setName("Joelma Campos");
		secretary.setExperience("04 anos");
		secretary.setCpfNumber("000934772334");
		secretary.setAge(20);
		
		
		System.out.println(student+ " is older age? " + student.olderPerson());
		System.out.println(director+ " is older age? "+ director.olderPerson());
		System.out.println(secretary+ " is older age? "+ secretary.olderPerson());
		
		System.out.println("Student Wage: "+student.getWage());
		System.out.println("Director Wage: "+director.getWage());
		System.out.println("Secretary Wage: "+secretary.getWage());
	}

}
