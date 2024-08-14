package week06.day15.LongVideo;

public class NestedLoopPractice {
    public static void main(String[] args) {

        //minute 2.55


        String str="aaabbccccddeeeeeff";
        String result="";

       for(int j=0;j<str.length();j++){

           char ch=str.charAt(j);// each character of str
           int count=0;
           for (int i = 0; i < str.length(); i++) {// responsible for comparing ch to each character of str and return the frequency of ch
               if(str.charAt(i)==ch){
                   count ++;
       }
           }

           if(count==2 && !result.contains(""+ ch)){
               result=result+ch;
           }

        }
        System.out.println(result);


    }
}
