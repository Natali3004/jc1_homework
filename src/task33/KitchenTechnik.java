package task33;

public class KitchenTechnik extends Technik  {
    String brandName;

    public KitchenTechnik(String name, String brandName) {
        super(name);
        this.brandName = brandName;
    }

    @Override
    public void display() {
        super.display();
    }

    public void brandName() {
        System.out.println(name + "  " + brandName);
    }
}
