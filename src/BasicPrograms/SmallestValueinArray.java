package BasicPrograms;

public class SmallestValueinArray {

    public static void main (String[] args){

        Integer givenArray[] = {4,2,7,3,6};

        int smallest = Integer.MAX_VALUE;
        for (int i=0; i<givenArray.length;i++) {
            if (givenArray[i] < smallest) {
                smallest = givenArray[i];
            }
        }System.out.println(smallest);
    }
}
