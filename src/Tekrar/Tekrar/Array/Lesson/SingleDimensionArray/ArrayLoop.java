package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;

public class ArrayLoop {
    public static void main(String[] args) {

        String []names={"Java", "Phyton","C**"+ "RUBY","C++"};


        for(int i=0; i< names.length; i++){
            System.out.println(names[i]);
        }

        for(int i =names.length-1 ; i>0 ; i--){

            System.out.println(names[i]);

        }


    }
}
