package week2day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int[] array = {2,5,7,7,5,9,2,3};
		Arrays.sort(array);
		for(int i = 0; i < array.length; i++) {
			for(int j = i+1; j < array.length; j++) {
				if(array[i]==array[j]) {
					System.out.println(array[i]);
				
			}
			
		}
	}

}
}
