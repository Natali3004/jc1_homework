package part6.task34;

public class TypeBankCard extends BankCard {
    String typeCard;

    public TypeBankCard(String nameBank, String typeCard) {
        super(nameBank);
        this.typeCard = typeCard;
    }
    public void showCard() {
        System.out.println("Тип вашей карты - " + typeCard);
    }

}