package part8.task45;


public class Main {
    public static void main(String[] args) throws AgeException {

        try {
            Age.retirementAge(25);
        } catch (AgeException e) {
            e.printStackTrace();
            System.out.println("NO pension for your age" );
            System.exit(1);
        } finally {
            System.out.println("Your age is right. You have a pension");
            System.exit(0);
        }
    }
}
