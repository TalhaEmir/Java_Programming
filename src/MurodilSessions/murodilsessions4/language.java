package MurodilSessions.murodilsessions4;

public class language {
    public static void main(String[] args) {

        String language="Turkish";
        String result="";

//if we put defaukt at the top we have to put break
        switch (language) {
            case "English"-> // no need break
                System.out.println("Hello World");

            case "Spanish"->
                System.out.println("Hola gracias");

            case "French"->
                System.out.println("Hola French");

            case "Turkish"->
                System.out.println("Hola Turkish");

            default->
                System.out.println("There no such a like language");

        }




    }
}
