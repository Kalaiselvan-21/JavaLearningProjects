package BasicPrograms;

public class PalindromeIgnoreSplChar {

	public static void main(String[] args) {
		String inputString = "m@a$d&a**m)";
		boolean result = isvalidPalindrome(inputString);	
		if(result==true)
		{
			System.out.println("Input String " +inputString + "is a valid Palindrome after removing Spl characters");
		}
		else 
		{
			System.out.println("Not a valid palindrome");
		}

	}

	public static boolean isvalidPalindrome(String str) 

	{

		String cleanString = str.replaceAll("[^a-zA-Z0-9]","");

		int left=0;
		int right = cleanString.length()-1;

		while(left<right)
		{
			if(cleanString.charAt(left)!= cleanString.charAt(right)) 
			{
				return false;

			}
			left++;
			right--;

		}
		return true;

	}


}
