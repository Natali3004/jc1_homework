package task35;

public class Main {
    public static void main(String[] args) {
        StructureFactory boss = new StructureFactory("Директор");
        StructureFactory worker = new StructureFactory("Рабочий");
        StructureFactory manager = new StructureFactory("Менеджер по продажам");

        TypeOfWork bossType = new TypeOfWork("Директор", "Руководить работниками завода");
        TypeOfWork workerType = new TypeOfWork("Рабочий", "Изготавливать изделия");
        TypeOfWork managerType = new TypeOfWork("Менеджер по продажам", "Продавать готовые изделия");

        Salary bossSalary = new Salary("Директор", "Руководить работниками завода",1600);
        Salary workerSalary = new Salary("Рабочий", "Изготавливать изделия", 160);
        Salary managerSalary = new Salary("Менеджер по продажам", "Продавать готовые изделия", 2000_000);

        boss.showPost();
        bossType.showType();
        bossSalary.bossSalary();

        worker.showPost();
        workerType.showType();
        workerSalary.workerSalary();

        manager.showPost();
        managerType.showType();
        managerSalary.managerSalary();




    }
}
