package week07.Day18.warmup.Pizza;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza();
        //pizza1.size='L';
        //pizza1.numberOfCheeseToppings=2;


        pizza1.setInfo('m',1,2);


        Pizza pizza2=new Pizza();
        pizza2.setInfo('l',1,2);


        System.out.println(pizza1);
        System.out.println(pizza2);

double total=0;
        for (int i=0;i<20;i++){

           Pizza smallPizza=new Pizza();
           smallPizza.setInfo('m',2,2);
           total +=smallPizza.calculateCost();
           Pizza medium=new Pizza();
           medium.setInfo('M',3,4);
           total +=medium.calculateCost();
           Pizza Large=new Pizza();
           Large.setInfo('L',4,5);
           total +=Large.calculateCost();
        }

        System.out.println("total= "+total);






    }





}
