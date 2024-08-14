package Arthurclass.week09;

public class Frequency {
    public static void main(String[] args) {
      /*  3. Frequency of Characters Task:
        Write a program to display the frequency of each character in a given string.
        Example:
        str = "aabbbcccc"
        Output:
        a2b3c4*/

        String str="aabbbcccc";
        String result="";

        for(int i=0;i<str.length();i++){// i=0 i<str.lenght()

            char ch=str.charAt(i);
            int frequency=0;

            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    frequency++;
                }
            }
            if(!result.contains(""+ch)){
                result +=""+ch+frequency;
            }

            }
        System.out.println(result);
        }

    }

