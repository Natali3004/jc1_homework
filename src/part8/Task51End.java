package part8;

import java.io.*;
import java.util.Objects;

public class Task51End {

    public static void main(String[] args) throws IOException {

        try (FileOutputStream listOfFiles = new FileOutputStream("D:\\1\\2\\3\\ListOfFiles.txt")) {
            File myCatalog = new File("D:\\1\\2\\3");
            if (myCatalog.isDirectory()) {
                for (File num : Objects.requireNonNull(myCatalog.listFiles()))
                    listOfFiles.write(num.getName().getBytes());

            }
        }
    }
}
