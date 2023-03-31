package part3;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Task10 {
    public static void main(String[] args) {
        int day = 31;
        int month = 12;
        int year = 2004;
        System.out.println("Введена дата : " + day + "/" + month + "/" + year);

        if (day == 28 && month == 2 && year % 4 == 0 && year % 100 != 0) {
            day = 29;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        } else if (day == 28 && month == 2 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            day = 29;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        } else if (day == 29 && month == 2 && year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
            day = 1;
            month++;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        } else if (day == 29 && month == 2 && year % 4 == 0 && year % 100 != 0) {
            day = 1;
            month++;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        } else if (day == 31 && month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            day = 1;
            month++;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        } else if (day == 30 && month == 4 || month == 6 || month == 9 || month == 11) {
            day = 1;
            month++;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        } else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);

        } else if (day > 31 | day < 1 | month > 12 | month < 1 ) {
              System.out.println("Дата введена неверно");
        } else {
            day++;
            System.out.println("Дата следующего дня: " + day + "/" + month + "/" + year);
        }
    }
}