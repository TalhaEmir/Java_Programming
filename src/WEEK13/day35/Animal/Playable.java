package WEEK13.day35.Animal;

public interface Playable {
   public static final boolean isFriendly=true; // static & final if he didnt give any access modifier by default it is public we can give just public by default
    // when we declare variable it is static and final by default access modifier by default public
    // bu variable icin saece access modifer olarak public kullaniliyor it is given by default
    //any time declare variable by default static and final baska bisey veremeyiz

    public static void main(String [] args){
        System.out.println(isFriendly);

        // is friendly = false because final ayni zamanda
    }

    public abstract void play();// bunda public veya abstract demene gerek yok cunku defsult olarak veriliyor


    // every interface should have abstract metod


    // metodda public static void main(String [] args) burada public yerine sadece private koyabilirsin static varsa



    //================================Methods====Static icin ===Public=============\\

    //public static void main(String [] args) or

    // metodlar icin static metodlar icin public access modifier verebilrisin yani static yazarsan staticten once private veya public verebilrisin


    //================================Methods====Static icin ====Private ============\\


    //private static void main(String [] args)


    //================================Methods====default method===  Instance emthod ===\\

   default void method1(){ // cunku interface instance method almaz cunku object yok

    }

    //private metodlar:
    //Özellik: private metodlar, yalnızca tanımlandıkları sınıf içinde erişilebilir. Bu, metodun instance olup olmadığını belirtmez, çünkü erişim seviyesini kontrol eder.
    //Örnek: private bir metod instance metod olabilir veya static olabilir. Erişim belirleyicisi yalnızca görünürlük ile ilgilidir.


//static metodlar:
//
//Özellik: static metodlar sınıfa bağlıdır ve sınıfın bir örneği oluşturulmadan çağrılabilir. Bu metodlar instance metodlar değildir, çünkü bir sınıfın örneği olmadan erişilebilirler.
//Örnek: static metodlar instance metod olarak kabul edilmezler.



    //eyer burdaki bir metodu alacaksan ve bu metod abstarct ise yani void play gibi diger sayfada yani subclassta buna body eklemen lazim public gibi mesela

}
