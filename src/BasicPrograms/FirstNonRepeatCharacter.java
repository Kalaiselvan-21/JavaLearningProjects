package BasicPrograms;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		
		String inputString = "swwiss";
		char result = nonrepeatchar(inputString);
		
		if (result!='\0') 
		{
			System.out.println("Non repeating character is: "+result);
		}
		else 
		{
			System.out.println("No non repeating character");
		}	
		
	}

	public static char nonrepeatchar(String str) {
		
		for(int i=0;i<str.length();i++)
		{
			char current = str.charAt(i);
			if (str.indexOf(current) == str.lastIndexOf(current))
			{
				return current;
			}
		}
		return '\0';
	}
	
	}
