package by.minsk.itakademy.arturzimin;

import java.io.*;
import java.util.Scanner;

public class Student {

    String name;
    String surname;
    int ege;

    public Student(String name, String surname, int ege) {
        this.name = name;
        this.surname = surname;
        this.ege = ege;
    }

    public static void createFile(String path) throws FileNotFoundException {
        File file=new File(path);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void writeTextToFile(String path,String text) throws IOException {
        File file =new File(path);
        if (file.exists()) {
            PrintWriter printWriter=new PrintWriter(new FileWriter(file,true));
            printWriter.write(text);
            printWriter.close();
            System.out.println(file);
        }

    }

    public static void readTextFile(String path) throws FileNotFoundException {
        File file=new File(path);
        Scanner sc =new Scanner(file);
        while (sc.hasNext()){
            String temp=sc.next();
            String a=" ";
            System.out.print(temp+a);

        }
        sc.close();
    }



}
