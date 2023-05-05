package part6.task35;

public class TypeOfWork extends StructureFactory {
    String type;

    public String getType() {
        return type;
    }

    public TypeOfWork(String post, String type) {
        super(post);
        this.type = type;
    }
    public void showType () {
        System.out.println("Должностные обязанности - " + type);
    }
}
