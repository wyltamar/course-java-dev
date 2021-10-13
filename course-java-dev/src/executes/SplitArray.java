package executes;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {

		String text = "wyltamar, Course Java, 80, 70, 90, 89";
		
		String [] textValues = text.split(",");
		
		System.out.println("--------------------------");
		System.out.println("Testing method Split");
		for(int i = 0; i < textValues.length; i++) {
			System.out.println(textValues[i]);
		}
		
		System.out.println("--------------------------");
		System.out.println("Testing to convert Array for list");
		
		/*Converting an Array to a list*/
		List<String> list = Arrays.asList(textValues);
		
		for(String values : list) {
			System.out.println(values);
		}
		
		
		/*Converting an list to a array*/
		String[] arrayConversion = list.toArray(new String[5]);
		System.out.println("--------------------------");
		System.out.println("Testing to convert List for Array");
		
		for(int i = 0; i < arrayConversion.length; i++) {
			System.out.println(arrayConversion[i]);
		}
	}

}
