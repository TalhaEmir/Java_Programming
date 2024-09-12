package InterviewAndWeeklyArrayandArraylist.FirstWeek.ArrayList.ArrayListCharDigit;

public class LettersDigitsChar {
    public static void main(String[] args) {


        String str="Wooden Spoon123!";

        str= str.replace(" ","").trim();

        char[] st1= str.toCharArray();



        for (char each : st1){
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

