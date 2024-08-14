package week11.Day30.Day30WarmUp;

public class PhoneShop {

    public static void main(String[] args) {
        Nokia nokia3310= new Nokia ("Nokia","A-33.10",'L',900,"Silver");
        System.out.println(nokia3310);
            Iphone iphone= new Iphone("Model iphon12",'l', 1005,"Black");

        System.out.println(nokia3310);

        nokia3310.selfDefense();

        iphone.faceTime(781938323);
        Samsung samsung=new Samsung("Note2",'l', 1005,"Black");
        samsung. freeze();

        System.out.println(iphone);
        System.out.println(nokia3310);
        System.out.println(samsung);



    }
}
