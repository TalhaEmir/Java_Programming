package InterviewQuestions.Interview;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {// if given sentence equals to reversed sentence it is palindrome

        Scanner input = new Scanner(System.in);

        String str = input.next();
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversed +=str.charAt(i);

        }
        System.out.println(reversed);

        if(str.equalsIgnoreCase(reversed)){
            System.out.println(str +" is palindrome");
        }else{
            System.out.println(str + " is not palindrome");
        }
    }
}

