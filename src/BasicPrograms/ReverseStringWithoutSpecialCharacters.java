package BasicPrograms;

public class ReverseStringWithoutSpecialCharacters {

	public static void main(String[] args) 
	{

		String str = "a!d#c&b$";
		revStringWithoutSplChar(str);
		

	}

	public static void revStringWithoutSplChar(String str) 
	{

		char[] chars = str.toCharArray();
		int start = 0;
		int end = str.length()-1;

		while(start<end) 
		{
			if(!Character.isLetterOrDigit(chars[start])) 
			{
				start++;
			}

			if (!Character.isLetterOrDigit(chars[end])) 
			{
				end--;
			}

			else {

				char temp = chars[start];
				chars[start] = chars[end];
				chars[end] = temp;

			}

		}

		System.out.println(new String(chars));	
		}

}
