package week14.day38;

public class Deneme {

    public static void main(String[] args) {


        try {
            System.out.println(0/9);
            System.out.println("Bunun dogrusu asagidadir trydadir");
        }catch(ArithmeticException e){
            System.out.println("Bunun dogrusu asagidadir catchtedir");
            System.out.println("bunun dogrusu 0/9 olmalidir");


        }

    }
}
