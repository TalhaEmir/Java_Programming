package Week05.day11.shortvideos;

public class lastindexof {

    public static void main(String[] args) {
// it start right to left and it gaves last character match
        String str="Javam Programming Language";

        int index1=str.indexOf("a");
        System.out.println(index1);
        System.out.println("================================");
        int index2=str.lastIndexOf("a");


        System.out.println(index2);
    }
}
