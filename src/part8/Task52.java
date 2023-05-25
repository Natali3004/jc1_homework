package part8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Task52 {
    public static void main(String[] args) {
        Task52Person person1 = new Task52Person("Olga", "One", 25);
        Task52Person person2 = new Task52Person("David", "Two", 58);
        Task52Person person3 = new Task52Person("Masha", "Three", 15);
        Task52Person person4 = new Task52Person("Sasha", "Four", 10);
        Task52Person person5 = new Task52Person("Dasha", "Five", 85);
        Task52Person person6 = new Task52Person("Petr", "Six", 40);
        Task52Person person7 = new Task52Person("Natasha", "Seven", 33);
        Task52Person person8 = new Task52Person("Artem", "Eight", 17);
        Task52Person person9 = new Task52Person("Egor", "Nine", 13);
        Task52Person person10 = new Task52Person("Genia", "Ten", 2);

        try {
            FileOutputStream fos = new FileOutputStream("document.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.writeObject(person3);
            oos.writeObject(person4);
            oos.writeObject(person5);
            oos.writeObject(person6);
            oos.writeObject(person7);
            oos.writeObject(person8);
            oos.writeObject(person9);
            oos.writeObject(person10);

            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
