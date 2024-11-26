package BasicPrograms;

public class LongestUniqueSubstring {

	public static void main(String[] args) {
		
		String inputString = "abcaabbdcsa";
		int length = longestuniquesubstring(inputString);
		System.out.println(length);

	}

	public static int longestuniquesubstring(String str) 
	
	{
		int maxLength = 0;
		String tempString = "";
		
		for (char c : str.toCharArray()) 
		{
			if(tempString.contains(String.valueOf(c)))
			{
				tempString = tempString.substring(tempString.indexOf(c)+1);
			}
			tempString += c;
			maxLength = Math.max(maxLength, tempString.length());
			
		}
		
		System.out.println("Longest Unique Substring: "+tempString);
		return maxLength;
	}

}
