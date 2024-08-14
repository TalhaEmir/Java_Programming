package week09.day23.ArraysLists;
import java.util.ArrayList;
import java.util.Arrays;
public class BulkOperations  {

    public static void main(String[] args) {



            ArrayList<Integer>numbers = new ArrayList<>();
            numbers.add(10);
            numbers.add(20);
            numbers.add(30);numbers.add(40);
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list1.addAll(numbers);// ArrayList is collection// it is added these 10 20 30 numbers after the 1,2,3

        System.out.println(list1);//[1, 2, 3, 10, 20, 30, 10]

        list1.addAll(1,numbers);
        System.out.println(list1);//[1, 10, 20, 30, 40, 2, 3, 10, 20, 30, 40]

        System.out.println("========================");


        ArrayList<Integer>scores=new ArrayList<>();



        System.out.println("=============AsListMethod===================");

        //list2.addAll(list1); sekklinde
        //list2.addAll(0, list1);

        //scores.addAll(75,85,90,90,90)  // should be one argument

        //asList method // returns a list

        scores.addAll(Arrays.asList(1,2,3,4)); // sadeced bu collectipn sekile kabul ediliyor

        scores.addAll(2,Arrays.asList(1,2,3,4));// or like this // items that after two gonna be shift to left

        System.out.println(scores);//[1, 2, 1, 2, 3, 4, 3, 4]



        System.out.println("===========================");

        ArrayList<String>student=new ArrayList<>();

        student.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));

        ArrayList<String>student2=new ArrayList<>();
        student2.addAll(Arrays.asList("Sumeyye","Shulur","Ttaianne"));
        System.out.println(student2);


        student.addAll(2,Arrays.asList("Sumeyye","Shulur","Ttaianne"));//[Gadir, Hasan, Sumeyye, Shulur, Ttaianne, Abidullah, Bilal]


        System.out.println(student);


        System.out.println("===========================");
        Integer[]nums={1,2,3,4,5,6,7,8,9};

        ArrayList<Integer>l1=new ArrayList<>(Arrays.asList(nums));//or
        l1.addAll(Arrays.asList(nums));// and that one
        // yada boyle
        //burda Integer non-primitive o yuzden dan diye kopyalamayiz bu yuzden asList veriyoruz
        // burda amacimiz Arrayi->ArrayLIste cevirmek
        //  ArrayList<integer>l1=new ArrayList<>(); boyle olamaz yani primitive
        // Integer[]nums={1,2,3,4,5,6,7,8,9}; it should be like this
        // not like this  int[]nums={1,2,3,4,5,6,7,8,9};
        System.out.println(l1);//[1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("=====ContainsAll=========");
        ArrayList<String>employees=new ArrayList<>();
        employees.addAll(Arrays.asList("Alena","Muhtar","Gador","Ali"));
        employees.contains("ALENA");
        boolean hasAlena= employees.contains("ALENA");
        boolean hasAelnaGadir=employees.containsAll(Arrays.asList("Alena","Gadir"));// order not important
        // if (Arrays.asList("Gadir","Alena")) gonna be same
        boolean hasMuhtarAliKuzzat=employees.containsAll(Arrays.asList("Muhtar","Kuzzat", "Ali"));

        System.out.println("hasAlena: "+hasAlena);//hasAlena: false

        System.out.println("hasAelnaGadir: "+hasAelnaGadir);//hasAelnaGadir: false

        System.out.println("hasMuhtarAliKuzzat: "+hasMuhtarAliKuzzat);//false


        System.out.println("===========RemoveList===================");


        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50,60,70,10,10,10,20,20,20));
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list);//[30, 40, 50, 60, 70]

        //Java'da bir listedeki belirli bir öğeyi
        // (örneğin, 4) kaldırmak için remove yöntemini kullanabilirsiniz.
        // Ancak, remove yöntemi yalnızca ilk karşılaşılan öğeyi kaldırır.
        // Eğer listede birden fazla öğeyi kaldırmak istiyorsanız, removeAll kullanmanız gerekir.


        System.out.println("===========RetainAll===================");
        //RetainAll

        ArrayList<String>developers=new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gador","Alena","Ali","Sumeyye","Shulur","Ttaianne","Kashayar"));
        //even if multiple value of same value gonna be same
        developers.retainAll(Arrays.asList("Alena","Kashayar","Muhtar"));
        System.out.println(developers);//[Alena, Muhtar, Alena, Kashayar]


        ArrayList<String>groceriesList=new ArrayList<>();
        groceriesList.addAll(Arrays.asList("Eggs","Potato","Milk","Tamoto","Rice","Orange","Blueberry","Strawberry"));
        //groceriesList.retainAll(Arrays.asList("Eggs","Potato","Milk","Tomato"));// or
        groceriesList.removeAll(Arrays.asList("Rice","Orange","Blueberry","Strawberry"));


















    }
}
