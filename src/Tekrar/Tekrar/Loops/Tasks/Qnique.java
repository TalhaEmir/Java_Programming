package Tekrar.Tekrar.Loops.Tasks;

public class Qnique {

    public static void main(String[] args) {
        String input="banana";
        String unique="";

        for(int i= 0 ; i<input.length(); i++){
               char each= input.charAt(i);
               if(unique.indexOf(each)==-1){
                   unique +="" +each;
               }

        }
        System.out.println(unique);
    }


}
