package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.Collections;

public class lETTERSdIGITSsPECIALcHAR {

    public static void main(String[] args) {
        String str= "Wooden Spoon123!?";

        str=str.replace(" ","");

        System.out.println( str);


        String digits=""; String letter="";  String isspecial="";


        for(char each: str.toCharArray()){
            if(Character.isDigit(each)){
                digits+=each;
            }else if(Character.isLetter(each)) {
                letter+=each;
            }else{
                isspecial+=each;
            }
        }

        System.out.println("digit " + digits +" letters" + letter + "is special" +isspecial  );



    }
}
