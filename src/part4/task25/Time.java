package part4.task25;

public class Time {
    public int sec = 15;
    public int min = 45;
    public int hour = 4;
    public int allSec;

    public void allTime(int sec, int min, int hour) {
        System.out.println("Full Time: " + hour + " hours " + min + " minutes " + sec + " seconds");
    }

    public int allSeconds(int sec) {
        allSec = (hour * 3600 + min * 60 + sec);
        System.out.println("ALL seconds: " + allSec + " seconds");
        return sec;
    }

    public int compareTo(Time two) {
        return allSec;
    }
}

