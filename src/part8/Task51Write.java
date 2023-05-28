package part8;

import java.io.*;

public class Task51Write {

    public static void main(String[] args) throws IOException {

        FileInputStream reader, reader2, reader3, reader4, reader5;

        try {
            reader = new FileInputStream("D:\\1\\2\\3\\one.txt");
            reader2 = new FileInputStream("D:\\1\\2\\3\\two.txt");
            reader3 = new FileInputStream("D:\\1\\2\\3\\three.txt");
            reader4 = new FileInputStream("D:\\1\\2\\3\\four.txt");
            reader5 = new FileInputStream("D:\\1\\2\\3\\five.txt");

            FileOutputStream allFiles;

            allFiles = new FileOutputStream("D:\\1\\2\\3\\allFiles.txt");
            allFiles.write(reader.readAllBytes());
            allFiles.write(reader2.readAllBytes());
            allFiles.write(reader3.readAllBytes());
            allFiles.write(reader4.readAllBytes());
            allFiles.write(reader5.readAllBytes());


            allFiles.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
