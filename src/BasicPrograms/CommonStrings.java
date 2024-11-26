package BasicPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonStrings {

	public static void main(String[] args) {
		
		String[] a1 = {"apple", "banana", "single", "Laxmi", "Raghu"};
        String[] a2 = {"june", "july", "apple", "april", "Laxmi"};
        
        List<String> result = commonstring(a1, a2);
        System.out.println(result);

	}

	private static List<String> commonstring(String[] a1, String[] a2) {
		
		List<String> common = new ArrayList<>();
		
		for (String str1 : a1) {
			for (String str2 : a2) {
				if(str1.equals(str2) && !common.contains(str1))
				{
					common.add(str1);
				}
				
			}
			
		}
		
		return common;
	}

}
