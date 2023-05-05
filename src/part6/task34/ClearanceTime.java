package part6.task34;

public class ClearanceTime extends TypeBankCard {
    int time;

    public ClearanceTime(String nameBank, String typeCard, int time) {
        super(nameBank, typeCard);
        this.time = time;
    }
    public void doneCard () {
        System.out.println("Ваша карта будет готова через " + time + " часов");
    }
}