package part6.task35;

public class StructureFactory {
    String post;

    public String getPost() {
        return post;
    }

    public StructureFactory(String post) {
        this.post = post;
    }
    public void showPost() {
        System.out.println("    Для должности " + post);
    }
}
