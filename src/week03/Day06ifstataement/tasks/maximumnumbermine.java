package week03.Day06ifstataement.tasks;

public class maximumnumbermine {

    public static void main(String[] args) {

        int numb1= 10;
        int numb2= 20;
        String result="";

   if(numb2>numb1){
       result= "20 is the maximum number";
   }else if(numb2<numb1){
       result= "10 is the minimum number";
   }else if(numb2==numb1){
       result= "it is equal";
   }

        System.out.println(result);



    }



}
