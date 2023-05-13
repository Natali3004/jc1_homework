package part8.task45;
class ageException extends Exception {

    private int age;
    public ageException(String message, int age) {
        super(message);
        this.age = age;
    }
}
class Age {
    public static int retirementAge(int age) throws ageException {

        if (age < 60 ) throw new ageException("NO pension", age);
        return age;
    }
}