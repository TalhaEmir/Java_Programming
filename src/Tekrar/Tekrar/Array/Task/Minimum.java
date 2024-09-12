package Tekrar.Tekrar.Array.Task;

public class Minimum {

    public static void main(String[] args) {

        int [] numbers={-1,-4,10,20,30,40,50,60};

        int[] minimum= new int[1];

        minimum[0]=numbers[0];

        int minimumNumber=numbers[0];

        for(int each: numbers){
            if(each<minimum[0]){
                minimum[0]=each;
            }
        }


        for(int i=0 ; i< numbers.length ; i++ ){
            if(numbers[i]<minimumNumber ){
                minimumNumber=numbers[i];
            }
        }

    }
}
