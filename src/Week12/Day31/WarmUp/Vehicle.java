package Week12.Day31.WarmUp;

public class Vehicle {

    private String brand;
    private String model;
    private String color;
    private int year;
    private double price;

    public Vehicle(String brand, String model, String color, int year, double price) {
        setBrand(brand);
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String toString() {
        return getClass().getSimpleName()+
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

