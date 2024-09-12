package Tekrar.Tekrar.ArrayList.Tasks.LettersDigitsSpecialChars;

public class LettersDigitsSpecialChars {

    public static void main(String[] args) {
        String str="Wooden Spoon123!";

        char []charArray= str.toCharArray();

        for(char each: charArray){
            if(Character.isLetter(each)){
                System.out.println("These are letters " + each);
            }else if(Character.isDigit(each)){
                System.out.println("These are digits " + each);
            }else if (!(Character.isLetterOrDigit(each))){
                System.out.println("These are specials characters " + each);
            }else{
                System.out.println("These are invalid characters");
            }
        }







    }
}
