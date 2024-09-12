package Tekrar.Tekrar.ArrayList.TekrarTASK;

public class UpperCaseLowerCase {

    public static void main(String[] args) {


        String str="JAVA java";


        str=str.replace(" ","");

        String uppercase="";
        String lowercase="";

        System.out.println(str);

        for(char each: str.toCharArray()){
            if(Character.isUpperCase(each)){
                uppercase+=each;
            }else{
                lowercase+=each;

            }
        }

        System.out.println("lowercase"  + lowercase + " uppercase " + uppercase);
    };
}
