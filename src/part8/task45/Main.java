package part8.task45;


public class Main {
    public static void main(String[] args) throws ageException {

        try {
            Age.retirementAge(25);
        } catch (ageException e) {
            System.out.println("NO pension for your age" );
            System.exit(1);
        } finally {
            System.out.println("Your age is right. You have a pension");
            System.exit(0);
        }
    }
}
