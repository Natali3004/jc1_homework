package part3;

public class task9 {
    public static void main(String[] args) {
        int rub = 14015;

        if (rub % 100 != 11 && rub % 10 == 1)
            System.out.println(rub + "  рубль");
        else if (rub % 100 != 12 && rub % 10 == 2) {
            System.out.println(rub + "  рубля");
        } else if (rub % 100 != 13 && rub % 10 == 3) {
            System.out.println(rub + "  рубля");
        } else if (rub % 100 != 14 && rub % 10 == 4) {
            System.out.println(rub + "  рубля");
        } else {
            System.out.println(rub + "  рублей");
        }
    }
}
