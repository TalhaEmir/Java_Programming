package week09.day24.Tasks;
import java.util.Collections;
import java.util.Arrays;



public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaaabbbcccddd";

        String result = "";

        //a3b4c5
        //str.split("");// collection haline uygun array dizisi haline getirmek icin
        for (String each : str.split("")) {
            //str.split("") her seferinde str String'ini her karakterine böler
            // ve bir String dizisi (array) döndürür.
            int frequency= Collections.frequency(Arrays.asList (str.split("")), each);// frequency metodda
            // ilk kelimeyi vercen sonra karakter hangisiysa onu vercen kelime arabaysa a yi istiyorsan
            //frequency(araba, a )gibi

            if(!result.contains(each)){
                result +=each+ frequency;
            }
        }

        System.out.println(result);
    }
}