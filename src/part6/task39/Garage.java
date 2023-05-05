package part6.task39;

public class Garage <T extends Vehicle> {
    public T avto;

    public Garage (T avto) {
    this.avto = avto;
    }

    public T getAvto() {
        return avto;
    }
}