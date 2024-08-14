package Tekrar.Days.Week3day6;

public class Ternary {
    public static void main(String[] args) {



        /*int a = 10;
int b = 20;

// a ve b'yi karşılaştırarak daha büyük olan değeri c değişkenine atayalım
int c = (a > b) ? a : b;

System.out.println("Daha büyük olan değer: " + c);



write a java program that can convert numbers between 0 ~ 9 to words
            Ex:
                number = 1;

            output:
                One

        Note: MUST use ternary
*/


        int number=3;

       String c= (number== 1)?"one":(number==2)?"two":(number==3)?"three":(number==4)?"four":"five";
        System.out.println(c);
    }
}
