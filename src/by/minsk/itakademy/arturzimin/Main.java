package by.minsk.itakademy.arturzimin;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {


        Student student1 = new Student("Andrey", "Ivanov", 28);

        Student.createFile("Student.txt");
        Student.writeTextToFile("Student.txt", "My name is Artur.\n My surname is Zimin");
        Student.readTextFile("Student.txt");


        RecursionReversNumberFibanachi rrnf = new RecursionReversNumberFibanachi();

        rrnf.countWorld1("hello hell a a a a fd df fd df");
        // System.out.println(reversNumber(1465667));

        rrnf.countUniqueWorld("A a a d f g h j");
        System.out.println(rrnf.reversNumber(123456789));
        rrnf.reversUsingRecursion(123456789);
        int n = 3;
        System.out.println("factorial off " + n + " is " + rrnf.factorialRecursion(n));
        LocalTime localTime1 = LocalTime.now();
        System.out.println(rrnf.fibonacci(40));
        LocalTime localTime2 = LocalTime.now();
        Duration duration1 = Duration.between(localTime1, localTime2);

        System.out.println(rrnf.fibonacci(10));
        LocalTime localTime = LocalTime.now();
        System.out.println(rrnf.fibonacci(40));
        LocalTime localTime3 = LocalTime.now();
        Duration duration = Duration.between(localTime, localTime3);

        System.out.println(duration);
        System.out.println(duration1);
    }


}








