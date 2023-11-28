package week2day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
				String test = "changeme";
				
				char[] charArray = test.toCharArray();
				
				for (int i = 0; i < charArray.length; i++) {
					
					if(i%2 !=0) {
						
						char charAt = test.charAt(i);
						System.out.print(Character.toUpperCase(charAt));
					}
					else {
						
						System.out.print(charArray[i]);

					}

				}

	}

}
