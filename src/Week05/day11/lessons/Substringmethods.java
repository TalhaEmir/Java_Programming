package Week05.day11.lessons;

public class Substringmethods {

    public static void main(String[] args) {
        String sentence4="I love Java Programming";
        String languaeName= sentence4.substring(7, 11);
        System.out.println(languaeName);

        System.out.println("===================");

        String sentence5="Today is Sunday, Tomorrow is Monday";
        String today= sentence5.substring(9, 15);
        System.out.println(today);

        System.out.println("==================");


        String email="CydeoSchoolJavaProgramming@gmail.com";// we are trying to print gmail for specific case

        int beginning= email.indexOf('@')+1 ;//first character of domain(g )index number because here few 'g'
        int ending= email.lastIndexOf('.');//
       String domain= email.substring(beginning, ending);
       System.out.println(domain);


        System.out.println("//================================================");
        String sentence6="I love Java Programming";// just give it programming string
        int indexOfP=sentence6.indexOf('P');
        int indexOfG=sentence6.lastIndexOf('g')+1 ;
        String programming= sentence6.substring(indexOfP, indexOfG);
        System.out.println(programming);


        //Same version but different solution

        String sentence7="I love Java Programming";// java programming print
        String r1= sentence7.substring(7, sentence6.length());
        System.out.println(r1);

        //

        String sentence8="I love Java Programming";
        String r2= sentence8.substring(7);
        System.out.println(r2);


        System.out.println("//================================================");

        String sentence9="Today is Sunday, Tomorrow is Monday";
        String tomorrow=sentence9.substring(sentence9.lastIndexOf(' ' ) + 1);
        System.out.println(tomorrow);

        System.out.println("//================================================");

        String sentence10="I study at Cydeo School";
        int indexOfC=sentence10.lastIndexOf('C');
        String SchoolName=sentence10.substring(11);
        System.out.println(SchoolName);


        System.out.println("//================================================");

        //Repeat method

        String str="Phyton";
        String result=(str + "\n").repeat(10);
        System.out.println(result);





    }
}
