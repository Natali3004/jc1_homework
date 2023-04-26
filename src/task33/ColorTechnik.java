package task33;
public class ColorTechnik extends KitchenTechnik {

    public ColorTechnik(String name, String brandName, String color, double price) {
        super(name, brandName);
        this.color = color;
        this.price = price;
    }

    String color;
    double price;

    public ColorTechnik(String name, String brandName) {
        super(name, brandName);

    }

    @Override
    public void display() {
        System.out.println(name + " " + brandName + " " + color + " " + price + " $");
    }
}



