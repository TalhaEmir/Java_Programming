package MurodilSessions.week10;

public class TestFoodObject {
    public static void main(String[] args) {

        Food pizza= new Food("Pizza");
        System.out.println(pizza);//Food{name='Pizza', quantity=0, unitPrice=$0.0, totalPrice=$0.0}
        //taco,4

        Food taco= new Food("Taco",4);
        System.out.println("taco" + taco);
        //add unit price to taco and get total
        taco.unitPrice=4.35;

        System.out.println("taco = "+ taco.calculatePrice());//taco = 17.4

        System.out.println(taco);//Food{name='Taco', quantity=4, unitPrice=$4.35, totalPrice=$17.4}



    }
}
