package week15.day39.SetDemo;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {


/*Evet, Java'nın koleksiyon framework'ü içinde birçok yapı birbirine dönüştürülebilir,
çünkü çoğu koleksiyon türü Collection arayüzünü veya onun alt arayüzlerini (örneğin, List, Set, Queue) uygular.
Bu nedenle, belirli bir hiyerarşi sırasına katı bir şekilde bağlı kalmadan, bir koleksiyondan diğerine geçiş yapmak genellikle mümkündür.

Ancak, bazı önemli noktaları göz önünde bulundurmak gerekir:

Veri Yapısının Özellikleri: Her koleksiyon tipi farklı özellikler sunar.
Örneğin, List yapıları sıralı bir yapıya sahiptir ve tekrarlayan elemanlara izin verirken,
Set yapıları tekrarlayan elemanlara izin vermez ve sıralama garanti edilmez (sıralı TreeSet dışında).

Dönüşüm Sırasında Veri Kaybı: Bir List'i bir Set'e dönüştürdüğünüzde, tekrarlayan elemanlar kaybolabilir.
Aynı şekilde, bir Set'i bir List'e dönüştürdüğünüzde, belirli bir sıralama garanti edilmeyebilir (özellikle HashSet kullanılıyorsa).

Performans Farkları: Koleksiyonlar arasında dönüşüm yaparken,
her koleksiyon türünün performans özelliklerini de dikkate almak önemlidir. Örneğin, ArrayList hızlı rasgele erişim sağlar,
LinkedList ekleme ve silme işlemlerinde daha etkilidir, HashSet ise hızlı arama işlemleri sunar.

Sonuç olarak, Java'da koleksiyonlar arasında dönüşüm yapmak oldukça esnektir ve
hiyerarşik sıralamaya katı bir şekilde bağlı olmanıza gerek yoktur, ancak veri yapısının özelliklerini ve potansiyel etkilerini dikkate almak önemlidir.*/

        Set <Integer>set3=new TreeSet<>();

        List<Integer>arrayList1= new ArrayList<>();// lirst accepts duplicsteds , keeps insertion order , has index

        arrayList1.addAll(Arrays.asList(10,20200,300,40,90));
        arrayList1.addAll(Arrays.asList(10,20200,300,40,90));
        arrayList1.addAll(Arrays.asList(10,20200,300,40,90));
        arrayList1.addAll(Arrays.asList(10,20200,300,40,90));
        System.out.println(arrayList1);//[10, 20200, 300, 40, 90, 10, 20200, 300, 40, 90, 10, 20200, 300, 40, 90, 10, 20200, 300, 40, 90]

//=============Set==============HashSet================================================================\\
        Set<Integer>set1= new HashSet<>();// order is random , accepts null key

        set1.addAll(Arrays.asList(10,20200,300,40,90));
        set1.addAll(Arrays.asList(10,20200,300,40,90));
        set1.addAll(Arrays.asList(10,20200,300,40,90));
        set1.addAll(Arrays.asList(10,20200,300,40,90));
        set1.addAll(Arrays.asList(10,20200,300,40,90));
        set1.addAll(Arrays.asList(null,null,null,null,null));


        System.out.println(set1);//[20200, 40, 10, 90, 300]

        //Hashset it has own order like char
        //duplicates no allowed also null

        //At the Set Interface HashSet (Class) fastest between HashSet , LinkedHashSet ,SortesdSet or TreeSet


//=============Set==============HashSet==============LinkedHasSet========================\\
        Set<Integer> set2= new LinkedHashSet<>();// keep insertion order, accepts null key
        set2.addAll(Arrays.asList(10,20200,300,40,90));
        set2.addAll(Arrays.asList(10,20200,300,40,90));
        set2.addAll(Arrays.asList(10,20200,300,40,90));
        set2.addAll(Arrays.asList(10,20200,300,40,90));
        set2.addAll(Arrays.asList(10,20200,300,40,90));
        set2.addAll(Arrays.asList(null,null,null,null,null));

        //duplicates no allowed also null

        System.out.println(set2);//[10, 20200, 300, 40, 90, null]

        // but it always keep order it doesnt change order it is different from HashSet


//=============Set===========SortedSet======TreesSet=========================================\\


        String str= null;
        //System.out.println(str.toLowerCase());// yoou can not call null method


        Set <Integer>set4=new TreeSet<>(); // keeps sorted order , does not accept duplicates
        set4.addAll(Arrays.asList(10,20200,300,40,90));
        set4.addAll(Arrays.asList(10,20200,300,40,90));
        set4.addAll(Arrays.asList(10,20200,300,40,90));
        set4.addAll(Arrays.asList(10,20200,300,40,90));
        set4.addAll(Arrays.asList(10,20200,300,40,90));
      // set4.addAll(Arrays.asList(null,null,null,null,null));


        System.out.println(set4);//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toLowerCase()" because "str" is null
        // if we add null

        //7-)Compare the value of each object why you can not PUT NULL

        System.out.println(set4);//[10, 40, 90, 300, 20200]

        // beacuse it is acsending order


        //=======================Conversion from Set to ArrayList=========================================\\

        String[] words= {"Java","Java","Java","Java","Java","Phyton","Phyton","C#","C++","Ruby", "C#","C#"};


        //LinkedHashSet<String>result= new LinkedHashSet<>(); ilk verdi sonra bunu sildi veya drgistirdi
       Set<String>result= new LinkedHashSet<>();
        result.addAll(Arrays.asList(words));

        System.out.println(result);//[Java, Phyton, C#, C++, Ruby]


        for(String each:result ){
            System.out.println(each);
        }


        //he change  LinkedHashSet<String>result= new LinkedHashSet<>(); this one with Set



        // if we want to get it second element of Set ====Onemli ====( second non duplicated element )================

        // muhtar convert it he did with constructor
        new ArrayList <>(result);
        //
       System.out.println(new ArrayList <>(result).get(1));

        // result bir Collection veya başka bir List türü olabilir, ve new ArrayList<>(result) ifadesi bu koleksiyondan bir ArrayList nesnesi oluşturur.


        //bir koleksiyon yapısının başka bir türdeki koleksiyona dönüştürülmesidir.


        // yalnızca bir Collection'ı başka bir koleksiyon yapısına (ArrayList) dönüştürme işlemidir.
        System.out.println(new ArrayList <>(result).get(1));


        //bunun disinda result.addAll(Arrays.asList(words)); bunu Arraye cevirebilir miyiz


        words= result.toArray(new String[0]);// converting to Set to Array

        //yani bu result.toArray(new String[0]); resulttaki butun ogeleri arraye cevirip wordsin String cinsinden 0 indeksinden baslayip kopyaliyor

        // hepsi icin kullanabiliyoiruz tum heps iicn ccollectionlart iicin
        System.out.println("Words Array: " + Arrays.toString(words));



        //===============================================================================================\\



        List<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,20,20,20,30,40,40,50,60,70,5,5,5,5,1,11,1,2,2,2,2));

        Set<Integer>n= new TreeSet<>(numbers);// converting to the List to Set


        System.out.println(n);


//( (LinkedList)list).poll();
        //System.out.println(new ArrayList <>(result).get(1));
        //Set<Integer>n= new TreeSet<>(numbers);


    }
}
