package week08.day20.Methods;

import java.util.Arrays;

public class ArraysUtilityMethods {
    public static void main(String[] args) {


        int []score={70,100,80,90,65};

        System.out.println(Arrays.toString(score));
        String result=Arrays.toString(score);
        System.out.println(result);

        System.out.println("+++++++++++++++++++");

        int[]a1={1,2,3,4,5};
        int[]a2={1,2,3,4,5};//illa to stringe ihtiyac yok veya yeni bir variablesa
        System.out.println(Arrays.equals(a1,a2));
        System.out.println("------------------------");

       boolean r1= Arrays.equals(a1,a2);
       System.out.println(r1);

        System.out.println("///////////////////");


        char []ch1={'A','B','C'};
        char []ch2={'A','C','B'};
        System.out.println(Arrays.equals(ch1,ch2));
        boolean r2= Arrays.equals(ch1,ch2);
        System.out.println(r2);
        System.out.println("===================");


        String[]s1={"A", "B", "C"};
        String[]s2={"A", "C", "B"};

        System.out.println(Arrays.equals(s1,s2));

        System.out.println("[][][][][][][][]");

        int[]nums={100,80,90,75,60,20,40,30, 19,21,0};

        System.out.println(Arrays.toString(nums));

       Arrays.sort(nums);
       System.out.println(Arrays.toString(nums));
        System.out.println("Minimum number:" + nums[0]);
        System.out.println("Maximum number:" + nums[nums.length-1]);

        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");

        String [] b1={"C","A","B"};
        String [] b2={"B","C","A"};
        Arrays.sort(b1);
        Arrays.sort(b2);
        Arrays.equals(b1,b2);
        System.out.println(Arrays.equals(b1,b2));

        System.out.println("////////////////////////////");

        String []students={"Madivar", "Ali","Abidullah","Alena"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("////////////////////////////");

        int[]array={10,20,30,40,50,60,70};//don give negative number length
        int[]array2=Arrays.copyOf(array,10);//give rest of numbers 0
        int[]array3=Arrays.copyOf(array2,11);
        int[]array4=Arrays.copyOf(array3,7);
        int[]array5=Arrays.copyOf(array4,5);

        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));

        System.out.println("////////////////////////////");

        int []n1={10,20,30,40,50};//
        int []n2={60,70,80,90,100,110,120};

        int[]n3=Arrays.copyOf(n1,n1.length+n2.length);//first he gave two
        // he attachted n1 element ve uzunlugu and also ikincinin uzunlugunu ekledi
        //diger asamada artik sadece n2nin elemntlerini verecek


        System.out.println(Arrays.toString(n3));
        
        //n2.f bu direk bunun loopu icin
        // indeks numarasi yani 50 ten sinra gelen elementin indeksi 5 lengh 6 yano bu ikisi yani seye isaret ediyor
        //cunku 0dan baslatiyourz n2 indeksi length 1--- n2 indeks0 lenght1
        // ik arrayin lengthi 5 , arraydaki 4. indeksteki elemtent 50 ,  5'ten sonraki gelen sifir indekste 5
        // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0, j= n1.length;  i<n2 .length ; i++, j++) {
            n3[j]=n2[i];
            
        }

        System.out.println(Arrays.toString(n3));

        System.out.println("////////////////////////////");

        char[]ch={'A','B','C','D','E','F','G'};
        // index;  0   1   2   3   4   5   6
        char[] result1=Arrays.copyOfRange(ch,0,4);

        System.out.println(Arrays.toString(result1));
        System.out.println("////////////////////////////");

        char[] result2=Arrays.copyOfRange(ch,2,5);
        System.out.println(Arrays.toString(result2));


        System.out.println("////////////////////////////");

        String str="Cydeo School";

        char[] asd=str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(asd));





    }



        






    }







