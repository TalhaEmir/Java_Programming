package Haydenclass.week07;

public class sequence {

    public static void main(String[] args) {


        String str="aabbbcddcdd";
        String unique="";
        int count;

        for(int i=0;i<str.length();i++){
            char each= str.charAt(i);
            count=0;
            for(int j=0;j<str.length();j++){
                if(each==str.charAt(j)){
                    count ++;
                }
            }
            System.out.println(count);

        }



        // = a2b3c2d1


    }
}
