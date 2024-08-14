package InterviewQuestions.Interview;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbbcccc";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count =0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            result+=""+ch+count;
            str =str.replaceAll(""+ch,"");
        }
        System.out.println(result);
    }
}
/*

	3. Write a program that can remove the duplicated characters from the a string

				Ex:
					str = "aabbbcccc"

					output:
						abc


 */

