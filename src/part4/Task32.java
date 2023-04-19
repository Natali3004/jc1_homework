package part4;

public class Task32 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String str = "aaabbbccc";
        String str2 = "";
        for (int i = 1; i <= 1000_000; i++) {
            str2 += str;
        }
        long endTime = System.currentTimeMillis();
        long time = (endTime - startTime) / 1000;
        System.out.println("Скорость выполнения c помощью String: " + time + " секунд");

        long startTime2 = System.currentTimeMillis();
        StringBuilder str3 = new StringBuilder();
        for (int i = 1; i <= 1000_000; i++) {
            str3.append("aaabbbccc");
        }
        long endTime2 = System.currentTimeMillis();
        long time2 = (endTime2 - startTime2) / 1000;
        System.out.println("Скорость выполнения c помощью StringBuilder: " + time2 + " секунд");

        if (time > time2) {
            System.out.println("Выполнение с помощью StringBuilder быстрее, чем с помощью оператора сложения и String");
        }
        else if (time < time2) {
            System.out.println("Выполнение с помощью StringBuilder медленее, чем с помощью оператора сложения и String");
        }
        else if (time == time2) {
            System.out.println("Время выполнения с помощью StringBuilder и с помощью оператора сложения и String одинаковое");
        }
    }
}