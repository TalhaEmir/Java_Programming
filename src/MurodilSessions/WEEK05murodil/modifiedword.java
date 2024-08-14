package MurodilSessions.WEEK05murodil;

public class modifiedword {

    public static void main(String[] args) {

    /*
        //create a program will ask the user to enter a word
        check if the word starts and ends with the same character
        if they are the same delete those caharacters
        abcde->bcd

        othersie- if the characters are npt the same replace the first charter to be "*"

        abce-> *bcd#
           */

        String word= "lol";
        String result="";
        int Lastindex=word.length()-1;
        // 'j'==

        //charAt it is not String why we using ==
        //String firstletter= word.charAt(0): Error because chrAt return primitive

       // String firstletter= word.charAt(Lastindex); wrong

        //If (fisrletter.equals(lastletter)) char pritimive does not have equals method

//check if first and last characters are same


        if (word.charAt(0)== word.charAt(word.length()-1)){ // we can not give equals of because its char

            System.out.println("First and lsat are same");
            //create partials string without first and last characters
            result= word.substring(1,word.length()-1);
        }else{
            result= "*"+ word.substring(1,word.length()-1 )+ "#";
        }


        System.out.println("word is "+ word);
        System.out.println("result is "+ result);



    }
}
