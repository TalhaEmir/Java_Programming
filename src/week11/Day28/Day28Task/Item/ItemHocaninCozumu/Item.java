package week11.Day28.Day28Task.Item.ItemHocaninCozumu;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public double calculateCost(){
        return unitPrice * quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null && !name.isBlank() && isValidName(name) && Character.isLetter(name.charAt(0))){
            this.name = name;
        }
    }

    private boolean isValidName(String str){
        str = str.replace(" ", "");
        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetterOrDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice > 0){
            this.unitPrice = unitPrice;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity > 0){
            this.quantity = quantity;
        }
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", total cost=" + calculateCost() +
                '}';
    }
}

