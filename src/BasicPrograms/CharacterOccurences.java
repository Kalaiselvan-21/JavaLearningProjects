package BasicPrograms;

public class CharacterOccurences {

	public static void main(String[] args) {
		
		String inputString = "programmming";
		countofcharacteroccurence(inputString);
		
	}

	public static void countofcharacteroccurence(String str) 
	
	{
		for(int i=0; i<str.length(); i++)
		{
			char currentChar = str.charAt(i);
			int count = 0;
			
			for(int j=0; j<str.length(); j++)
			{
				if(str.charAt(j) == currentChar) {
					count++;
				}
			}
				if(str.indexOf(currentChar) == i) {
					System.out.println(currentChar+ ": "+count);
				}
			}		
	}

}
