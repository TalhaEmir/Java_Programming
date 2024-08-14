package week11.Day28.Day28Task.Item;

public class Item {

    private String name;
    private double unitPrice;
    private double quantity;


    public Item(String name,double unitPrice,double quantity){
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name.isEmpty()) {
            System.out.println(name + "can not be blank or empty");
            return;
        }
        if (!Character.isLetter(name.charAt(0))) {
            System.out.println("Name first letter can not be another character except letter");
            return;
        }
        for (int i = 0; i < name.length(); i++) {
            if(!Character.isLetterOrDigit(name.charAt(i))|| ((""+name.charAt(i)).equals(""))){
                System.err.println("Invalid item name");System.exit(1);
            }
            this.name=name;
        }
    }


        public double getUnitPrice(){
        return unitPrice;
        }

        public void setUnitPrice(double unitPrice){
                if(unitPrice<0){
                    System.out.println("Unit price can not be less than zero");
                    return;
                }
                this.unitPrice=unitPrice;
        }





        public double getQuantity(){

        return quantity;
        }

    public void setQuantity(double quantity) {
        if (quantity < 0) {
            System.out.println("quantity can not be less than zero");
            System.exit(1);
        }

        this.quantity=quantity;
    }


    public double calCost(){
        return unitPrice*quantity;
    }


    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                " total cost" + calCost() +
                '}';
    }
}