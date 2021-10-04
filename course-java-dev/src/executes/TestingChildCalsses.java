package executes;

import classes.Director;
import classes.Secretary;
import classes.Student;

public class TestingChildCalsses {
	
	public static void main(String [] args) {
		
		Student student = new Student();
		student.setName("João Filho");
		student.setAge(23);
		student.setMatherName("Maria Livanira");
		
		Director director = new Director();
		director.setName("Slvino Alvino");
		director.setTitulation("Pedagogo");
		director.setDiretionTime(5);
		
		Secretary secretary = new Secretary();
		secretary.setName("Joelma Campos");
		secretary.setExperience("04 anos");
		secretary.setCpfNumber("000934772334");
		
		
		System.out.println(student);
		System.out.println(director);
		System.out.println(secretary);
		
	}

}
