package week08.day20.Methods;

import java.util.Arrays;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        int[]numbers={1,2,3,4,5,6,7,8,9,10,11};



            for(int each:numbers){
                if(each%2!=0){
                    System.out.println(each);
                }

            }

        for (int i = 0 ; numbers.length > i; i++) {

            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);

            }

        }


        int[]nums={1,2,3,4,5,6,7,8,9,10,11};

        int max=nums[0];
        int min=nums[0];

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }


        }

        System.out.println("max: " + max + ", min: " + min);



        int[]numeros={1,2,3,4,5,6,7,8,9,10,11};
        int maximo =numeros[0];
        int minimo=numeros[0];


        for (int each : numeros) {
            if (each >maximo){
                   maximo=each;
            }
            if (each <minimo){
                minimo = each;
            }


            }



        System.out.println("En büyük sayı: " + maximo);
        System.out.println("En küçük sayı: " + minimo);


        int[]a1= {10,20,30,40,50};
        int[]a2={60,70,80,90,100,110,120};

        int[]a3= new int[a1.length+a2.length];
        int k=0;

        for (int each : a1) {
            a3[k++]=each;

        }

        for (int each : a2) {
            a3[k++]=each;
        }


        System.out.println(Arrays.toString(a3));
        
        
        String[]names={"Mohammad Karimi","Vasyl Dobrianoski", "Gdir Garimov", "Abidullah Rahimi"};


        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" " )+1 ));
            
        }


        




    }
}
