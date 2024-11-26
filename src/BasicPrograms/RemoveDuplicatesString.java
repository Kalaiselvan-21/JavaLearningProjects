package BasicPrograms;

public class RemoveDuplicatesString {

	public static void main(String[] args) {
		
		String originalString = "programming";
		String dupString = removeduplicate(originalString);
		
		System.out.println(dupString);
		
}

	public static String removeduplicate(String str) 
	{
		String resultString = " ";
		
		for(int i=0; i<str.length(); i++)
		{
			char currentChar = str.charAt(i);
			
			if(resultString.indexOf(currentChar)==-1)
			{
				resultString = resultString + currentChar;
			}
		}
		return resultString;
		
	}
		
}
