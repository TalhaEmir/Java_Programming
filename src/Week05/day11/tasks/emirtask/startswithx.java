package Week05.day11.tasks.emirtask;

public class startswithx {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        /*Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
*/




        }

    public static void startsWith(String name){

        if(name.toLowerCase().startsWith("x")){
            System.out.println(name.replaceFirst("x","a"));
        }


    }
}
