package Haydenclass.Week10;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayCharCharacter {
    public static void main(String[] args) {
 String[]thePerson={"word", "alemdar", "videos", "vlog"};//thePerson[i]= ilk kelime(word).charAt(0)


       //elsoru arrayin icindeki v ile baslayan kelimeleri istiyorum
        String result="";
        for(int i=0 ; i<= thePerson.length-1 ; i++){ //arrayde length icin parantez yok// i neden diyoruz indeks artar ama icerdeki 0 degeri artmaz hep devam eder
            if(thePerson[i].charAt(0)=='v'){
               System.out.println(thePerson[i]);
            }
        }


        //thePerson[i] dinamik artar //charAt(0) statik artmaz
    }
}
