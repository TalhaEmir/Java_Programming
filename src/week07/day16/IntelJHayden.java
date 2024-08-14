package week07.day16;

public class IntelJHayden {


    public static void main(String[] args) {


        String str="talha";
        String result= "";

        for (int j= 0; j <str.length(); j++){
// 1 - a
            char ch= str.charAt(j);   //   1- t     2- a    3- l    4- h    5- a
            int count=0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {   // t==t,  t==a, t==l, t==h, t==a
                    System.out.println(ch + "==" + str.charAt(i));                      // a==t,  a==a, a==l, a==h, a==a
                    count ++;
                }

            }
            if (count == 2 && !result.contains("" + ch)){
                result += ch;
            }

        }

        System.out.println(result);
    }




}
