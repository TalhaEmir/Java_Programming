package week14.day38.ThrowKeyword;

public class TestPerson {
    public static void main(String[] args) {

        Person person1= new Person("Daniel",100,'M');


        System.out.println(person1);

try {
    person1.setAge(10);

}catch(RuntimeException e){
    e.printStackTrace();
}

        System.out.println(person1);

        String str = "Java";

        try {
            System.out.println(str.charAt(-10));//code1
            System.out.println(10/0);//code2
            Thread.sleep(3000);//code3
        }catch (IndexOutOfBoundsException e){

            System.out.println("code1 handled");

        }catch (ArithmeticException e){

            System.out.println("code2 handled");

        }catch (InterruptedException e){

            System.out.println("code3 handled");

        }


    }
}
