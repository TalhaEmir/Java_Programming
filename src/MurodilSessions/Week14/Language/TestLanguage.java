package MurodilSessions.Week14.Language;

public class TestLanguage {

    public static void main(String[] args) {
        English english = new English();
        Spanish spanish = new Spanish();
        Arabic arabic = new Arabic();

        System.out.println(english.hello());
        System.out.println(english.bye());

        System.out.println(spanish.hello());
        System.out.println(spanish.bye());

        System.out.println(arabic.hello());
        System.out.println(arabic.bye());

        Language lan1 = new English();
        Language lan2 = new Spanish();
        Language lan3 = new Arabic();

        System.out.println(lan1.hello());
        System.out.println(lan2.hello());
        System.out.println(lan3.hello());

        /*
        Static methods of interface can only be called from interface name, no other way.
        They are not inherited
         */
        Language.description();
//        lan1.description(); Error.
//        arabic.description();
        lan1.translate();
    }
}