package Tekrar.Days.DAY15_GENEL.DAY15TASKS;

public class duplicate {

    public static void main(String[] args) {



        String str="aabbbbccccc";

        String result=""; //"aa"


        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i);
            if(!(result.contains(""+ ch))){
                result= result + ch;
            }

               }
        System.out.println(result);
            }

        }
