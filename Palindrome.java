package week2day2;

public class Palindrome {

	public static void main(String[] args) {
		
		
				int input = 89098;
				
				String outputStr = "";
				String inputStr = Integer.toString(input);
				
				for(int i=inputStr.length()-1 ; i >=0 ; i--) {
					
					outputStr = outputStr + inputStr.charAt(i);
				}
				System.out.println(inputStr);
			
				if(inputStr.equals(outputStr)) {
					
					System.out.println("Given String "+ input +" is  palindrome");
				}
				else {
					
					System.out.println("Given String "+input +" is not palindrome");
				}

	}

}
