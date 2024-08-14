package Tekrar.MURODILTEKRAR.week11;

public class SpongeBob {
    /*
    In Sponge case, every alternate character is capitalized,
    including spaces and numbers, as they also take positions for conversion.

    toSpongeCase("java is fun") => "jAvA iS FuN"
    toSpongeCase("hello") => "hElLo"
    toSpongeCase("ab1c") => "aB1C"
    toSpongeCase("w") => "w"
     */
    public static void main(String[] args) {


   // secind character is capital

        System.out.println(capitalized("JAVA is FUN"));
        System.out.println(capitalized("hello"));
        System.out.println(capitalized("ab1c"));

}

    public static String capitalized(String word){
        String input="";

        for(int i=0 ; i< word.length() ;i++ ){
            if(i%2==0){
                input += word.toUpperCase().charAt(i);
            }else {
                input+=word.toLowerCase().charAt(i);
            }
        }

        return input;

    }
}