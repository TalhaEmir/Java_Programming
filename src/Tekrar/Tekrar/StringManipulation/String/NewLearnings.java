package Tekrar.Tekrar.StringManipulation.String;

public class NewLearnings {

    public static void main(String[] args) {


        String str="Wooden Spoon";/// At the Heap inside the special String Pool

        String str1=new String("Wooden Spoon");// at the heap(big pool) not at the pool(small pool)

        System.out.println(str1);
    }
}
