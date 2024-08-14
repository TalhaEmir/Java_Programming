package week06.day15.LongVideo;

public class BreakStatement {

    public static void main(String[] args) {

       for(int i= 0; i <10; i++){
           if (i==6){ // if i's values reaches 6
               break;// exits the loop
           }
           System.out.println(i);

       }


        System.out.println("=============");




       for(char i= 'A'; i <'Z'; i++){
           if(i=='J'){
               System.out.println(i);
               break;

           }
           System.out.println(i);
       }

    }
}
