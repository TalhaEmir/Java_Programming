package week08.day21.Task;

public class ClassMateReversed {

    public static void main(String[] args) {
/* Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
*/

        String[] classmates = {"Debra Mayer", "Kenneth Schaden", "Manual Gusikowski", "Charlotte Tromp", "Lucio Stark", "Mary Bauch", "Hilda Prosacco", "Elisha Cole", "Salvatore Hermann", "Kim Cassin"};
//Eğer amacınız isimleri tersine çevirmekse,
// her ismi karakter karakter dolaşıp tersine çevirmek için
// iki döngü kullanmak zorunludur.
// ilki duz yazdiriyor sonraki tersine yazdiriyor


        for (String eachName : classmates) {
            String reversedName = "";
            for (int i = eachName.length() - 1; i >= 0; i--) {
                reversedName += eachName.charAt(i);
            }
            System.out.println(reversedName);
        }
        System.out.println("==========================");



        for (String eachName : classmates) {// method instead of for loop
            System.out.println(reverse(eachName));
        }

    }

    public static String reverse(String str) {
        String reversed="";
        for (int i = str.length() - 1; i >= 0; i--) {
             reversed+= str.charAt(i);
        }
        return reversed;
    }


}
