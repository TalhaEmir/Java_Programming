package MurodilSessions.WEEK05murodil;

public class SMS {

    public static void main(String[] args) {

        String sms="Sender: <Mike Smith>. From number: [202- 123-3456]. Message: {I love programming and problem solving}";
        int senderStart= sms.indexOf("<" )+1;
        int senderEnd = sms.indexOf('>');
        System.out.println("sender start: " + senderStart);
        System.out.println("sender end: " + senderEnd);
        String sender= sms.substring(senderStart, senderEnd);
        System.out.println("sender= " + sender);


        // phone number extraction

        String phone= sms.substring(sms.indexOf('['), sms.indexOf(']'));
        System.out.println("phone = "+ phone);

        //extract message

        String message= sms.substring(sms.indexOf('{'), sms.indexOf('}'));
        System.out.println("message = "+ message);




    }
}
