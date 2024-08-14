package week06.day15.day15tasks;

public class Duplicate {

public static void main(String[] args) {




    String str="xzcasfavagaav";

    String result=""; //"aa"

    for(int i=0;i<str.length();i++){
        char each=str.charAt(i);
        if(!(result.contains(each+""))){
            result=result+each;
        }
    }
    System.out.println(result);



    String asd= "xyzxyzxyzxyz";

    String dsa="";

    for(int i=0;i<asd.length();i++){
        char d=asd.charAt(i);
        if (result.contains("" + str.charAt(i) )) {
            continue; //skip
    }else {
            result=result+d;
        }
        }
}
}