package BasicPrograms;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {64, 34, 25, 99, 87, 12, 4};
		int n=arr.length;
		
		for(int i=0; i<n; i++) {
			for (int j=0; j<n-1; j++) {
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for (int i : arr) {
			System.out.println(i);
			
		}

	}

}
