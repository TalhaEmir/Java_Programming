package week03.DAY07ifstatements.longvideo;

public class gradelevel {

    public static void main(String[] args) {

        int gradeLevel= 2;
        String result= "";

       if(gradeLevel>1|| gradeLevel<5){
           result="Elemantary School";
       }else if(gradeLevel>5 || gradeLevel<10){
           result="middle School";
       }else if(gradeLevel>10 || gradeLevel<20){
           result="high school";
       }else{

       }
        System.out.println("result = " + result );

    }
}
