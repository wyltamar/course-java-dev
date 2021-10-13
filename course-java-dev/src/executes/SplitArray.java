package executes;

public class SplitArray {

	public static void main(String[] args) {

		String text = "wyltamar - Course Java - 80, 70, 90, 89";
		
		String [] textValues = text.split("-", 3);
		
		for(int i = 0; i < textValues.length; i++) {
			System.out.println(textValues[i]);
		}
	}

}
