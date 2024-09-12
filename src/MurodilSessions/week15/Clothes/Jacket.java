package MurodilSessions.week15.Clothes;

public class Jacket extends Clothes implements HasHood{
    public void wear() {
        System.out.println(getClass().getSimpleName() + "Wearing a jacket ");
    }

    public void putOnHood() {
        System.out.println(getClass().getSimpleName() + "Wearing a hood");
    }
    }

