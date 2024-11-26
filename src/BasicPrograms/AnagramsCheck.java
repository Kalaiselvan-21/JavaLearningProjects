package BasicPrograms;

/* 
 * Check if both the String length is equal
 * Convert String to Character Array
 * Sort both the arrays
 * Check if both the sorted arrays are equal
 */

import java.util.Arrays;

public class AnagramsCheck {

	public static void main(String[] args) {
		
		String str1 = "silent";
		String str2 = "listen";
		
		boolean result = areAnagrams(str1, str2);
		if (result) {
			System.out.println("Anagrams");
		}
		else {
			System.out.println("Not Anagrams");
		}

	}

	public static boolean areAnagrams(String str1, String str2) {
		
		if (str1.length()!= str2.length()) {
			return false;
		}
		
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		return Arrays.equals(array1, array2);
		
	}

}
