package week07.day16;

public class InterviewFrequencyWord {

    /*Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4
		        "java JAVA jAvA JAva" // count=0;
		        java Java Java count=1
		        Java Java =2
		        Java =3
		         =4

		        */


    public static void main(String[] args) {

        String sentence="Java Java Java Java";

        String word="Java";


       int count=0;

       sentence=sentence.toLowerCase();
       word=word.toLowerCase();


       while(sentence.contains(word)){
           count++;
           sentence=sentence.replaceFirst(word,"");//Java Java Java
       }

       System.out.println(count);







    }

}
