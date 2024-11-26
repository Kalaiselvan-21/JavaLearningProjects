package BasicPrograms;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 5;
		
		a = a-b;
		b = a+b;
		a = b-a;
		
		System.out.println(a);
		System.out.println(b);

	}

}
