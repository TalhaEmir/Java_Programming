package week03.Day06ifstataement.ifclauseday6;

public class numbersofday {

    public static void main(String[] args) {


    int number=1;

    boolean month31days=(number==1 || number==3 || number==5 || number==7 || number==8);
    boolean month30days=(number==4 || number==6 || number==9 || number==11);
    boolean month29months=(number==2);
    String result="";


            if(month31days){
                result="31 days";
            }else if(month30days) {
                result = "30 days";
            }else {
                result = "29 days";
            }
        System.out.println(result);
        }
    }
