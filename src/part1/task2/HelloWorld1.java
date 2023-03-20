package part1.task2;

public class HelloWorld1 {
    public static void main(String[] args) {
        int s = 3555555;
        int sec;
        int m;
        int min, h, hour, day, d, week;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = (h - hour) / 24;
        day = d % 7;
        week = (d - day) / 7;
        System.out.println(week + " недель " + day + " дней " + hour + " часов " + min + " минут " + sec + " секунд ");
    }

}
