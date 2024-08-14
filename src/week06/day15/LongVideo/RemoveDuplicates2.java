package week06.day15.LongVideo;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        /*

        Write a proogram that can remove the duplicated characters from a string


         */

        String str= "xyzxyzxyzxyz";

        String result="";

        for (int i = 0; i < str.length(); i++) {

            if (result.contains("" + str.charAt(i) )) {
                continue; //skip
            }
            result += str.charAt(i);

        }
        System.out.println(result);



        System.out.println("==============================");

        // find the sum of all the even number between 50-100
                int sum=0;
        for (int i = 50; i < 101; i++) {
            if(i%2==0){
                System.out.println(i+ " ");

            }

        }

        for (int i= 50; i<101; i+= 2){


            }

        for (int i= 50; i<101; i++){
            if(i%2!=0){ // if the i's value is odd number
                continue;
            }
            System.out.print(i+ " ");

        }

        }

    }



