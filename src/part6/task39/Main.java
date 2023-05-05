package part6.task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите наименование первого объекта: " );

        String object = scanner.nextLine();
        Garage<Car> garage1 = new Garage<>(new Car(object));
        System.out.println("Первый объект " + garage1.getAvto().name);

        System.out.println("Введите наименование второго объекта: ");
        String object2 = scanner.nextLine();
        Garage<Motorcycle> garage2 = new Garage<>(new Motorcycle(object2));
        System.out.println("Второй объект " + garage2.getAvto().name);
    }
}
