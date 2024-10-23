package BasicPrograms;

public class FindNumberInAnArray {

    public static void main (String[] args){

        int array[] = {2,3,4,5,4,4};
        int numberToFind = 7;

        boolean found = false;

        for (int number : array){
            if(number == numberToFind){
                found = true;
                break;
            }
        }if(found){
            System.out.println("Number Present");
        } else {
            System.out.println("Number not Present");
        }
    }
}