package MurodilSessions.Week11Review;

public class T03SpongeCase {
    /*
    In Sponge case, every alternate character is capitalized,
    including spaces and numbers, as they also take positions for conversion.

    toSpongeCase("java is fun") => "jAvA iS FuN"
    toSpongeCase("hello") => "hElLo"
    toSpongeCase("ab1c") => "aB1C"
    toSpongeCase("w") => "w"
     */

    public static void main(String[] args) {
        System.out.println(toSpongeCase("JAVA is FUN"));
        System.out.println(toSpongeCase("hello"));
        System.out.println(toSpongeCase("ab1c"));
        System.out.println(toSpongeCase("W"));
        System.out.println(toSpongeCase("Hi"));
    }

    public static String toSpongeCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                result += Character.toUpperCase(input.charAt(i));
            }else{
                result += Character.toLowerCase(input.charAt(i));
                //result += input.charAt(i)+"".toUpperCase();
                //result += input.toUpperCase().charAt(i);
            }
        }

        return result;
    }
    }


