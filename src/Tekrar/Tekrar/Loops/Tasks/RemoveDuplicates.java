package Tekrar.Tekrar.Loops.Tasks;

public class RemoveDuplicates {

    public static void main(String[] args) {

        //thats the logic=

       //first of all convert to each character char then create char variable then loop it
        String str="aabbbcccc";
        String result="";

        for(int i=0 ; i<str.length() ; i++){// //i: index numbers of str

           char each=str.charAt(i);//// each character of the String str

           if(!result.contains("" + each ))// if the string result does not contain the character of string str yet
               //result += each; // then we will add the character to string result
                result +=each;

        }

        System.out.println(result);
    }
}
