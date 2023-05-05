package part6.task33;

class Technik implements TurnOn {

    String name;

    public Technik(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }


    @Override
    public void turnOn() {
        System.out.println(name + "  turn on");
    }
}
