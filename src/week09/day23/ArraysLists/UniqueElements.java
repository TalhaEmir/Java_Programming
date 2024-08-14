package week09.day23.ArraysLists;
import java.util.ArrayList;
import java.util.Arrays;
public class UniqueElements {
    public static void main(String[] args) {
        ArrayList<String>namesit=new ArrayList<>();

        namesit.add("Java");//0
        namesit.add("C**");//1
        namesit.add("Phyton");//2
        namesit.add("Java");
        namesit.add("Ruby");
        namesit.add("C+");
        namesit.add("java");
        namesit.add("phyton");
        namesit.add("Ruby");
        namesit.add("c++");
        namesit.add("phyton");
//Evet, doğru anladınız. if (namesit.indexOf(each) == namesit.lastIndexOf(each)) ifadesi,
// bir öğenin listede yalnızca bir kez görünüp görünmediğini kontrol eder.
// Eğer bir öğe listede sadece bir kez bulunuyorsa,
// indexOf ve lastIndexOf metodlarının döndürdüğü indeksler aynı olur.
        //String de karakterin indeksini soruyor


        for (String each : namesit) {
            if(namesit.indexOf(each)==namesit.lastIndexOf(each)){
                System.out.println(each);
                //break;first unique element
            }





        }
    }
}
