package week07.Day18.warmup.Pizza;

public class Pizza {

   public char size;
  public int numberOfCheeseToppings;
    public int numberOfPepperoniToppings;
// calculates the Total price of the Pizza, returns it as double

    //
        public double calculateCost() {
            double totalPrice = 0;
            switch (size) {
                case 'S':
                case 's':
                totalPrice = 10 +2 *(numberOfCheeseToppings + numberOfPepperoniToppings);
                break;
                case 'M':
                case 'm':
                totalPrice = 12 + 2 *(numberOfCheeseToppings + numberOfPepperoniToppings);
                break;
                case 'L':
                case 'l':
                totalPrice = 14 + 2 *(numberOfCheeseToppings + numberOfPepperoniToppings);
                default:
                    System.out.println("Invalid size");
            }
            return totalPrice;
        }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseToppings=" + numberOfCheeseToppings +
                ", numberOfPepperoniToppings=" + numberOfPepperoniToppings +
                ", total price=" + calculateCost() +
                '}';
    }


    public void setInfo(char size,int numberOfCheeseToppings, int numberOfPepperoniToppings  ){
            this.size = size;
            this.numberOfCheeseToppings = numberOfCheeseToppings;
            this.numberOfPepperoniToppings = numberOfPepperoniToppings;
    }

        /*1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping*/




}
