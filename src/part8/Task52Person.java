package part8;

import java.io.Serializable;

public class Task52Person implements Serializable {
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }



    public Task52Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String toString() {
        return "Surname: " + surname + "; Name: " + name + "; Age: " + age;
    }
}
