package InterviewAndWeeklyArrayandArraylist.FirstWeek.ArrayList.ArrayListCharDigit;

public class LettersDigitChar2 {


    public static void main(String[] args) {
        String str="Wooden Spoon123!";

        String digit=""; String letters=""; String specialChars="";


        for(char each: str.toCharArray()){
            if(Character.isLetter(each)){
                letters += each;
            } else if(Character.isDigit(each)){
                digit += each;
            } else {
                specialChars += each;
            }
        }
    }



    }



