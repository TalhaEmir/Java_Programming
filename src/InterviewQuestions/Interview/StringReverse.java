package InterviewQuestions.Interview;

public class StringReverse {
    public static void main(String[] args) {
        String str = "complement";
        String reverse ="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println("reverse of "+str+" is " + reverse);

        System.out.println("---------------------------------------------------------");


        System.out.println(reverse("I love Java"));



    }

    public static String reverse(String str){

        String reverse ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
