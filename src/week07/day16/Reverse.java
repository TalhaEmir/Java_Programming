package week07.day16;

public class Reverse {


    public static void main(String[] args) {
//reversing string


        String str = "Cydeo School";


        //"avaJ"


        String reverse = "";//"a" + "v"+ "a"+ "j";


        for (int i = str.length() - 1; i >= 0; i--) {// i= index number of the given string starting from last index to index 0
            reverse += str.charAt(i); // to get the each characters of the starting from last index to index zero
        }
        System.out.println(reverse);
        System.out.println("===================");
        String name = "Ernej Jenesbekovich Apazov";



    }
}