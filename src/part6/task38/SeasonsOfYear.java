package part6.task38;

import java.util.Scanner;

public enum SeasonsOfYear {
    Spring("Весна", 92),
    Summer("Лето", 92),
    Autumn("Осень", 91),
    Winter("Зима", 90);


    SeasonsOfYear(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String description;
    public int countOfDays;

    public int getCountOfDays() {
        return countOfDays;
    }

    public static void countDay() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 1) {
            System.out.println("Количество дней в этом сезоне- " + SeasonsOfYear.Spring.getCountOfDays());
        } else if (num == 2) {
            System.out.println("Количество дней в этом сезоне - " + SeasonsOfYear.Summer.getCountOfDays());
        } else if (num == 3) {
            System.out.println("Количество дней в этом сезоне - " + SeasonsOfYear.Autumn.getCountOfDays());
        } else if (num == 4) {
            System.out.println("Количество дней в этом сезоне- " + SeasonsOfYear.Winter.getCountOfDays());
        } else {
            System.out.println("Введено неверное число.");
        }
    }
}
