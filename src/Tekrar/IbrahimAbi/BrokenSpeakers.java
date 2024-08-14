package Tekrar.IbrahimAbi;

public class BrokenSpeakers {




      /*
The Method checks if every character in a specified sentence (ignoring spaces) can
be typed using the keys that are still working on a broken keyboard.

workingKeys contains keys that are still working
check if sentence can be typed using the keys that still working.
ignore spaces and case differences

canTypeSentence("abcd","bad") => true
canTypeSentence("helotwrdg","Hello world") => true
canTypeSentence("avd","java") => false

 */


    public static void main(String[] args) {
        System.out.println(canTypeSentence("abcd", "bad"));
        System.out.println(canTypeSentence("helotwrdg", "Hello world"));
        System.out.println(canTypeSentence("abcd", "bad car"));
        System.out.println(canTypeSentence("avd", " Ajdar"));

    }

    public static boolean canTypeSentence(String workingKeys, String sentence) {
        //make all lowercase and remove spaces for correct checking:

        workingKeys = workingKeys.toLowerCase();
        sentence = sentence.replace(" ","").toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            if (!workingKeys.contains(sentence.charAt(i)+"")) {
                return false;
            }
        }

//        for(char eachChar : sentence.toCharArray()) {
//            if (!workingKeys.contains(eachChar+"")) {
//                return false;
//            }
//        }
        return true;
    }
}


