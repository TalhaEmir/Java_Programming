package MurodilSessions.Week11Review.static_review;

import java.util.ArrayList;

public class MedalResultTest {

    public static void main(String[] args) {
        MedalResult Austria = new MedalResult("Austria", 0, 0 , 1);//decleration / instantiation
        System.out.println(Austria.total);

        MedalResult Canada = new MedalResult("Canada", 3, 4, 7);
        System.out.println(Canada);
        System.out.println("Canada total = " + Canada.total);

        System.out.println("==========================");

        ArrayList<MedalResult> list = new ArrayList<>();


        System.out.println("list = " + list);


        list.add(Austria);
        list.add(Canada);
        list.add(new MedalResult("Germany", 4, 3, 2));// burada objenin ismi yok kendisi var indeks number bunu MedalResult Austria = new MedalResult("Austria", 0, 0 , 1);//decleration / instantiation boyle yapariz
        System.out.println("=======ListAdd==========");

        System.out.println("list = " + list);
// icerideki newli olan bie seyi nasil obkeye esitlerim
        System.out.println(list.get(2));
        System.out.println(Canada.gold);//3
        System.out.println(list.get(2).gold);//4



    }


    // for creating country and country's medals
 //list.add(new MedalResult("Germany", 4, 3, 2)); boyle ekledigi bir ulkeyi nasil cagiririm tek mesela
    //mesela  MedalResult Austria = new MedalResult("Austria", 0, 0 , 1); bunun austria diye cagirabilirim
    // bu array listesinin icindeki ulkeleri cagarmak istesek ne yapariz ???? ya da gold veya bronz


}