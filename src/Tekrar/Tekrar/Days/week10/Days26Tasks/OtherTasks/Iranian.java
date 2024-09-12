package Tekrar.Tekrar.Days.week10.Days26Tasks.OtherTasks;

public class Iranian {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isIranian;


    public Iranian(){

    }

    public Iranian(double width, double length, double unitPrice, boolean isIranian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isIranian = isIranian;
    }


    public String toString() {
        return "Iranian{" +
                "width =" + width +
                ", length =" + length +
                ", unitPrice =" + unitPrice +
                ", isIranian =" + isIranian +
                " total price is = "+ calCost() +
                '}';
    }

    public  double calCost(){
        double totalPrice;


        if(!isIranian){
            totalPrice=(width * length) * unitPrice;
        }else{
            totalPrice=(width * length) * unitPrice + 200;
        }

return totalPrice;
    }
   /* public double calcCost(){
        double totalCost = width * length * unitPrice;
        return totalCost + (isPersian ? 200 : 0);
    }*/

}
