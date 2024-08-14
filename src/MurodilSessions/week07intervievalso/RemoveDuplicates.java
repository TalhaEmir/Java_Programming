package MurodilSessions.week07intervievalso;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String input="banana";
        String unique="";

        for(int i=0;i<input.length();i++){
            char each=input.charAt(i);
            if (!unique.contains(each + "")){// eyer icinde yoksa ekle diyoruz yani icinde o karakter yoksa unique in icinde
                unique+=each;
            }
        }



        System.out.println("unique= "+unique);
        System.out.println("=================================");
        System.out.println(removeDuplicates("java"));

//remove duplicates




    }

    public static String removeDuplicates(String str){
        String unique="";
        for(int i=0;i<str.length();i++){
            char each=str.charAt(i);
            if (!unique.contains(each + "")){
                unique += each;
            }

        }
        return unique;







    }

}
