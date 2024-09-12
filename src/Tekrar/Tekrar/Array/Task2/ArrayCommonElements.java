package Tekrar.Tekrar.Array.Task2;

public class ArrayCommonElements {

    public static void main(String[] args) {
        int [] array1= {1,2,3,4,5};
        int [] array2= {4,5,6,7,8};
        int unique=0;
        for(int each: array1){
            for(int each1: array2){
                if(each==each1){
                    unique=each;
                    System.out.println(each);
                }
            }

        }
    }
}
