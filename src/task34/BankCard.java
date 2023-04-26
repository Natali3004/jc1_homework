package task34;

public class BankCard {
    String nameBank;

    public BankCard(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getNameBank() {
        return nameBank;
    }
public void chooseBank() {
    System.out.println("Ваш банк " + nameBank);
}

}
