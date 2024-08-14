package WEEK02.DAY04Concenation.Tasks;

public class CarlInfo {


    public static void main(String[] args) {

        short year= 2018;
        String make= ("Toyota"+" "),
               model=("Camry,"),
               miles=( + 50000+" "+"miles,"),
               colour=("Red,");
                long price= 19000;
        String lancer=(year+ " " +make+model+miles+colour+ "$"+price);

        System.out.println(lancer);

    }
}
