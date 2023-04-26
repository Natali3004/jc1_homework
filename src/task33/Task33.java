package task33;

public class Task33 {
    public static void main(String[] args) {

        Technik one = new Technik("Kettle");
        Technik one2 = new Technik("Oven");
        KitchenTechnik two = new KitchenTechnik("Fridge", "LG");
        KitchenTechnik two2 = new KitchenTechnik("Dishwasher", "Elecrolux");
        ColorTechnik three = new ColorTechnik("Coffee machine", "BOSH", "black", 100);

        one.display();
        two.brandName();
        two2.display();
        three.display();
        one2.turnOn();
        two2.turnOn();
    }

}

