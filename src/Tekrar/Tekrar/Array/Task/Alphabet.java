package Tekrar.Tekrar.Array.Task;

public class Alphabet {

    public static void main(String[] args) {

        char [] alphabet={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        for(int i=0 ; i< alphabet.length ; i++){
            System.out.println(alphabet[i]);
        }

        for(int i=alphabet.length-1 ; i>=0; i--){
            System.out.println(alphabet[i]);
        }

    }
}
