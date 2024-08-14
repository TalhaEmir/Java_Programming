package MurodilSessions.week10;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Arrays;

public class FilterCharacters {

   /* Filter Characters [
    ArrayList, Wrapper class, loop, boolean]

    Create a program that will have a String of different characters, of different types. Filter(group) all the digits, letters, and special characters

    ex:
    String str = "abcd@!#$etyi123lkjhaqwer%^&879";
    digits: 123879
    letters: abcdetyilkjhaqwer
    special: @!#$%^&*/

    public static void main(String[] args) {

        String str="abcd@!#$etyi123lkjhaqwer%^&879";
        //convert to str to Array. using to toCharArray method.
        // it will return char[] array with each character.
        System.out.println(Arrays.toString(str.toCharArray()));
        //using split with("").
        //return String[] array with each character

        //split with "and add all to ArrayList
        //String[] convert to ArrayList<String>
        //Arrays.asList(String[])=>convert to ArrayList<String>
// 1-) Convert String str to String[] using split("")

        String [] allCharsArr= str.split("");


        System.out.println(Arrays.toString(str.split("")));
        System.out.println(Arrays.toString(str.toCharArray()));



//2-) Convert String [] allCharsArr--Array-- to ArrayList<String> using (Arrays.asList())
        ArrayList<String>allChars= new ArrayList<>(Arrays.asList(allCharsArr));
        System.out.println("allChars= " + allChars);
        System.out.println("first Char= " + allChars.get(0));

        //1-)create new ArrayList digits and loop allChars List.
        //every Character is String and Character is only accept is Char.
        //we have to convert to String to Char
        //if char is digit(Character.isDigit(0) then add to digits arrayList
        ArrayList<String> digits= new ArrayList<>();

        //ArrayList<Integer> digits= new ArrayList<>();

        for(String eachChar: allChars){
            //eachChar.charAt(0)->convert to char
            if(Character.isDigit(eachChar.charAt(0))){//"a".charAt(0)->'a' which car
                digits.add(eachChar);
                // digits.add(Integer.parseInt(eachChar));// convert String to integer
            }
        }
        System.out.println("digits" + digits);

        //2)addAll character to digit arrayList, then removeIf char is not digit
        ArrayList<String> digits2= new ArrayList<>();

        //add all elemetns from allChars list to digits2 list
        digits2.addAll(allChars);
        //remove all characters that are NOT digit;
        digits.removeIf(e->!Character.isDigit(e.charAt(0)));
        //digits.removeIf(e->e.charAt(0)>= '0' && e.charAt(0),<='9');
        System.out.println("digits2= " + digits2);

        //letters
        ArrayList<String> letters= new ArrayList<>();
        letters.addAll(allChars);
        //remove all chars that are not letter
        letters.removeIf(e->!Character.isLetter(e.charAt(0)));
        System.out.println("letters= " + letters);


        //SPECIAL
        ArrayList<String>special= new ArrayList<>();
        special.addAll(allChars);
        //remove all characters that are letter or numbers
        special.removeIf(each->Character.isLetterOrDigit(each.charAt(0)));
        System.out.println("special= " + special);























    }
}
