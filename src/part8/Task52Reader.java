package part8;

import java.io.*;

public class Task52Reader {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("document.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

          Task52Person person1 = (Task52Person) ois.readObject();
          Task52Person person2 = (Task52Person) ois.readObject();
          Task52Person person3 = (Task52Person) ois.readObject();
          Task52Person person4 = (Task52Person) ois.readObject();
          Task52Person person5 = (Task52Person) ois.readObject();
          Task52Person person6 = (Task52Person) ois.readObject();
          Task52Person person7 = (Task52Person) ois.readObject();
          Task52Person person8 = (Task52Person) ois.readObject();
          Task52Person person9 = (Task52Person) ois.readObject();
          Task52Person person10 = (Task52Person) ois.readObject();

            System.out.println(person1);
            System.out.println(person2);
            System.out.println(person3);
            System.out.println(person4);
            System.out.println(person5);
            System.out.println(person6);
            System.out.println(person7);
            System.out.println(person8);
            System.out.println(person9);
            System.out.println(person10);

          ois.close();



        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
