package Tekrar.Tekrar.Loops.Tasks;

public class Palindrome {

    public static void main(String[] args) {

        String word = "HIH";
        String reversed = "";

        for(int i=word.length()-1 ; i>=0 ; i--){
            reversed += ""+ word.charAt(i);
        }
        if(word.equals(reversed)){
            System.out.println("Palindrome");
        }else{
            System.out.println(" not Palindrome");
        }
    }
}
