package week04.day08.tasks;

public class https {

    public static void main(String[] args) {


        int statusCode=200;
        String result="";

        switch(statusCode){
            case 200:
                result="OK";
                break;
            case 201:
                result="Created";
                break;
            case 202:
            result="Accepted";
            break;
            case 301:
            result="Moved Permanently";
            break;
            case 303:
            result="Not Modified";

        }
        System.out.println(result);
    }
}
