package Week12.Day31.Animal_MethodOverriding;

public class Lion extends Animal{
    public Lion(String name, String breed, char gender, int age, String size, String color, boolean isAfricanLion) {
        super(name, breed, gender, age, size, color);
        this.isAfricanLion = isAfricanLion;
    }

    private boolean isAfricanLion;

    public boolean isAfricanLion() {
        return isAfricanLion;
    }

    public void setAfricanLion(boolean africanLion) {
        isAfricanLion = africanLion;
    }

    @Override
    public void eat() {
        System.out.println(getName() + getBreed() + " is eating sheep");
    }


    public void roar(){
        System.out.println("Lion " + getName() + getBreed()+ isAfricanLion()+ " is roaring");
    }


    public String toString() {
        return super.toString().replace("}","")+
                ",African Lion='" + isAfricanLion + '\'' +
        '}';
    }
}
