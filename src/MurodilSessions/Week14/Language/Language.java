package MurodilSessions.Week14.Language;

public interface Language {

    public static final String DEFAULT_ENCODING = "UTF-8";

    public abstract String hello();
    String bye();

    public static void description() {
        System.out.println("Languages have the ability to express thoughts and ideas to others using units of sound like words or sentences. There is often rules or syntax for how the words come together");
    }

    public default void translate() {
        System.out.println("Translating...");
    }
}
