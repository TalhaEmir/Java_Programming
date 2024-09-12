package Tekrar.Tekrar.Days.Day16;

public class Reverse {
    public static void main(String[] args) {
        
        String name="Cydeo Lesson";
        
        String reverse="";


        for (int i = name.length()-1 ; i >= 0 ; i--) {
            reverse+=name.charAt(i);
            
        }
        System.out.println(reverse);
    }
}
