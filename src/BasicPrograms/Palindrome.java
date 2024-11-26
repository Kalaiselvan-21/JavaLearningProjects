package BasicPrograms;

public class Palindrome 
{

	public static void main(String[] args) {

		String input = "madam";
		boolean result = palindrome(input);

		if (result) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a palindrome");
		}

	}

	public static boolean palindrome(String str) {

		int left = 0;
		int right = str.length()-1;

		while(left<right) 
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return false;
			}

			left++;
			right--;

		}
		return true;
	}

}
