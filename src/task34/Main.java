package task34;

public class Main {
    public static void main(String[] args) {
        BankCard bank1 = new BankCard("PriorBank");
        BankCard bank2 = new BankCard("ALFABank");

        TypeBankCard debit = new TypeBankCard("PriorBank", "дебетовая");
        TypeBankCard credit = new TypeBankCard("ALFABank", "кредитовая");

        ClearanceTime express = new ClearanceTime("PriorBank", "international", 5);
        ClearanceTime classic = new ClearanceTime("PriorBank", "international", 48);

        bank1.chooseBank();

        debit.showCard();

        express.doneCard();

    }
}
