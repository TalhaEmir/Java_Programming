package week08.day19Array.Task;
import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char []ascending= new char[26]; // INDEX 0 // LAST 25
        char []descending= new char[26];

        for (int i = 0, j='A', k='Z'; i < ascending.length; i++ , j++, k++) {
            ascending[i] = (char) j; //buradaki tum degerleri numbersi nin icindeki elementlere esitliyor
            descending[i] = (char) k; //buradaki tum degerleri numbersi nin icindeki elementlere esitliyor

        }

        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));


        System.out.println("=========================");

        char[]characters=new char[65535];


        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;

        }

        System.out.println(Arrays.toString(characters));

/*Burada characters[i] = (char) i; ifadesi şu anlama gelir:
i bir int değeri iken, (char) i ifadesi bu int değerini bir char (karakter) türüne dönüştürür.
Bu dönüşüm, ASCII tablosuna göre yapılır.
Yani, i değeri ASCII tablosundaki bir karakterin numarasına karşılık gelir
ve (char) i ifadesi bu numaraya karşılık gelen karakteri verir.

        Örneğin:

        i = 65 olduğunda, (char) 65 ifadesi 'A' karakterine karşılık gelir.
                i = 97 olduğunda, (char) 97 ifadesi 'a' karakterine karşılık gelir.
                characters dizisini char türünde doldurmak için for döngüsünde i değeri 0'dan
                characters.length uzunluğuna kadar artırılır
                ve her bir i değeri karşılık gelen char karakterine dönüştürülerek characters dizisinin uygun indeksine atanır.

        Son olarak, System.out.println(Arrays.toString(characters)); ifadesi characters dizisinin içeriğini string olarak ekrana yazdırır.

        İşte bir örnek: bu kismin ustunu kirmiziyla markerla ve oyle tut*/

    }
}
