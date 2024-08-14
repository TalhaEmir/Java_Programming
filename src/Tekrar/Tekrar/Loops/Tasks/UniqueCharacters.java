package Tekrar.Tekrar.Loops.Tasks;

import Haydenclass.week07.unique;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabcccd";

        String unique="";

        for(int i=0; i<str.length() ;i++ ){
            int frequency=0;
            char each=str.charAt(i);
            for(int j=0; j<str.length(); j++){
                if(each==str.charAt(j)){
                    frequency++;
                }

        }

            if(frequency==1){
                unique += each;
            }


        }

        System.out.println(unique);
    }

}
