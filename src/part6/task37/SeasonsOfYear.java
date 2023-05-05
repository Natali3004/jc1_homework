package part6.task37;

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



    public static void nextSeason() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 4) {
            SeasonsOfYear season = SeasonsOfYear.values()[0];
            System.out.println("Следующий сезон года - " + season.description);
        } else if (num == 1 | num == 2 | num == 3) {
            SeasonsOfYear season = SeasonsOfYear.values()[num];
            System.out.println("Следующий сезон года - " + season.description);
        } else {
            System.out.println("Введено неверное число.");
        }
    }
}


