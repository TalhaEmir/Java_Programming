package Arthurclass.week08.Tekrar;

public class ConsecutiveNumber {

    public static void main(String[] args) {

        int n=31;
        for(int i=1;i<=n;i++){
            String result="";

            if(i%2==0){
                result+="codility";
            }
            if(i%3==0){
                result+="Test";
            }
            if(i%5==0){
                result+="Coders";
            }
            if(result.isEmpty()){
                result+=""+ i;
            }
            System.out.println(result);
        }

    }
}
