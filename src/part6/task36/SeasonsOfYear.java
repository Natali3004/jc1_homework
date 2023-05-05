package part6.task36;

public enum SeasonsOfYear {
    SPRING("Весна",92),
    SUMMER ("Лето", 92),
    AUTUMN ("Осень", 91),
    WINTER("Зима", 90);


    SeasonsOfYear(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    private String description;
    private int countOfDays;

}
