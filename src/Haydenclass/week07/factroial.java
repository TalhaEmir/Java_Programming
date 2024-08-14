package Haydenclass.week07;

public class factroial {



    public static void main(String[] args) {

        int num= 5; //1*2*3*4*5
        int factorial= 1;
        //System.out.println("factorial= "+factorial);

        for(int i=1; i<=num; i++){
            factorial *= i;
            // factorial *=i
            System.out.println("factorial= "+factorial);
        }
        System.out.println("factorial= "+factorial);
        System.out.println("======================");
        System.out.println(getFactorial(3));


    }


    public static int getFactorial(int num){
        int factorial=1;
        for (int i = 1; i <= num; i++) {

            factorial *= i;
        }
        return factorial;



    }
}


