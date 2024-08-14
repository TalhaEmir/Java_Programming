package Tekrar.Tekrar.Array.Task;

public class EvenOddNumbers {
    public static void main(String[] args) {

       int oddNumber=0;

       int evenNumber=0;


        int [] array={1,2,3,4,5,6,7};

        for(int i=0 ; i< array.length ; i++ ){

            if(array[i]%2!=0){
                oddNumber++;
            }

            if(array[i]%2==0){
                evenNumber++;
            }
        }

        System.out.println("The array has "+ oddNumber + " numbers and " + evenNumber+ " numbers" );



    }
}
