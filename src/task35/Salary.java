package task35;

public class Salary extends TypeOfWork {
    public Salary(String post, String type, int value) {
        super(post, type);
        this.value = value;
    }

    int value;

    public void bossSalary() {
        System.out.println("Заработная плата согласно обязанностям составляет: " + value + " рублей");
    }

    public void workerSalary() {
        System.out.println("Заработная плата согласно обязанностям составляет: " + value * 5 + " рублей");
    }
    public void managerSalary() {
        System.out.println("Заработная плата согласно обязанностям составляет: " + value*5/10_000 + " рублей");
    }
}
