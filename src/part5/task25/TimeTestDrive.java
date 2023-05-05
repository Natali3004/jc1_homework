package part5.task25;

public class TimeTestDrive {
    public static void main(String[] args) {

        Time one = new Time();
        Time two = new Time();

        one.allTime(one.sec, one.min, one.hour);
        two.allSeconds(two.sec);

        int i = one.compareTo(two);
        System.out.println("Compare : " + i);
    }
}