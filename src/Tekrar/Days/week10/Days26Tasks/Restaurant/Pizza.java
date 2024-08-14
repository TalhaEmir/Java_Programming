package Tekrar.Days.week10.Days26Tasks.Restaurant;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping,numberOfPepperoniTopping;
    public static String company="Dominos";




    public static String getCompany(){
        return company;

    }



    public Pizza(){

    }

    public Pizza(String size){
        this.size = size;
    }

    public Pizza(String size,int numberOfCheeseTopping){
        this();
        this.numberOfCheeseTopping=numberOfCheeseTopping;
    }



    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this(size,numberOfCheeseTopping);
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                "calc Cost = " + calcCost()+
                "company name is" + getCompany()+
                '}';
    }


    public double calcCost(){
       double totalCost=0;
         if(size.equalsIgnoreCase("Small")){
             totalCost= 10+ numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;
         }else if(size.equalsIgnoreCase("Medium")){

             totalCost= 12+ numberOfCheeseTopping*2 + numberOfPepperoniTopping*2;

        }else if(size.equalsIgnoreCase("Large")){
             totalCost = 14 + numberOfCheeseTopping * 2 + numberOfPepperoniTopping * 2;

        }
         return totalCost;

    }

    /*public int calcCost() {
        int baseValue = switch (size) {
            case "Small" -> 10;
            case "Medium" -> 12;
            case "Large" -> 14;
            default -> 0;
        };

        return baseValue + 2 * (numberOfCheeseTopping + numberOfPepperoniTopping);
    }*/

}
