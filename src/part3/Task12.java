package part3;

public class Task12 {
    public static void main(String[] args) {

        daysWeek(7);
    }
static void daysWeek (int dayWeek) {

                switch (dayWeek) {
            case 1:
                System.out.println("Понедельник - пойти на курсы");
                break;
            case 2:
                System.out.println("Вторник - сходить в бассейн");
                break;
            case 3:
                System.out.println("Среда - прочитать книгу");
                break;
            case 4:
                System.out.println("Четверг - сделать домашнюю работу");
                break;
            case 5:
                System.out.println("Пятница - встретиться с друзьями");
                break;
            case 6:
                System.out.println("Суббота - выспаться за неделю");
                break;
            case 7:
                System.out.println("Воскресенье - подготовиться к новой неделе");
                break;
            default:
                System.out.println("Число введено неверно");
        }
    }
}
