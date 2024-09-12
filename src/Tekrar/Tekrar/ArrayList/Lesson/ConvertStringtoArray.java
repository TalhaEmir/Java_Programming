package Tekrar.Tekrar.ArrayList.Lesson;

public class ConvertStringtoArray {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ccddabaa";

        // Her iki stringi de char array'e çeviriyoruz
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Yeni bir array oluşturuyoruz, boyutu iki array'in toplam boyutu kadar olacak
        char[] combinedArray = new char[array1.length + array2.length];

        // İlk array'i yeni array'e kopyalıyoruz
        System.arraycopy(array1, 0, combinedArray, 0, array1.length);

        // İkinci array'i yeni array'in geri kalan kısmına kopyalıyoruz
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);

        // Sonuç olarak birleşik array'i yazdırıyoruz
        System.out.println(combinedArray);
    }
}
