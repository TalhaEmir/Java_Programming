package MurodilSessions.week15.Clothes;

public class Tshirt extends Clothes implements HasHood {

    public void wear(){
        System.out.println(getClass().getSimpleName() + "Wearing a thsirt");

    }

    public void putOnHood() {
        System.out.println(getClass().getSimpleName() + "Wearing a hood");
    }



}
