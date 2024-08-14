package week03.Day06ifstataement.ifclauseday6;

public class mediannumber {


    public static void main(String[] args) {

            int a= 10;
            int b=15;
            int c=20;

            boolean bistheMedianNumber= b<c || b>a;
            boolean aistheMedianNumber2= b<a || a>c;
            boolean cistheMedianNumber3= !aistheMedianNumber2 && !bistheMedianNumber;
            String result="";

            if(bistheMedianNumber){
                result="15 is the median number";
            }else if(aistheMedianNumber2){
                result="10 is the median number";
            }else if(cistheMedianNumber3){
                result="20 is the median number";
            }
        System.out.println();
    }
}
