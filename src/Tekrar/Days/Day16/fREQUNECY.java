package Tekrar.Days.Day16;

public class fREQUNECY {
    public static void main(String[] args) {



        String sentence="Java Java Java Java";

        String word="Java";

        int count=0;

        sentence=sentence.toLowerCase();
        word=word.toLowerCase();

        for(int i=0;i<=sentence.length();i++){
            if(sentence.contains(word)){
                count++;
                sentence=sentence.replaceFirst(word,"");//Java Java Java
            }



        }
        System.out.println(count);

        while(sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,"");//Java Java Java
        }

        System.out.println(count);


    }
}
