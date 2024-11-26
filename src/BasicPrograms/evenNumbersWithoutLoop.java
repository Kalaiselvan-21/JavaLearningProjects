package BasicPrograms;

public class evenNumbersWithoutLoop {
	
	

	public static void main(String[] args) {
		printEvenNumbers(0);	

	}

	private static void printEvenNumbers(int num) {
		
		if (num<=100) {
			
			System.out.println(num);
			printEvenNumbers(num+2);
			
		}
		
	}

}
