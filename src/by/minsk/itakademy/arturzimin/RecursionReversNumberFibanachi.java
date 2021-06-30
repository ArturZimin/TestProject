package by.minsk.itakademy.arturzimin;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.*;
public class RecursionReversNumberFibanachi {






    public static int fibonacci(int number) {

        if (number <= 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);

    }


    public static long fibonacciWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
            System.out.println(result);
        }
        return result;
    }

    /**
     * создать метод ,который высчитывает факториал
     */

    public static int factorialRecursion(int number) {
        if (number == 0 || number == 1) {
            return 1;
        } else {
            return number * factorialRecursion(number - 1);
        }
    }


    /**
     * Посчитать слова из текста,которые не повторяются(т.е. уникальные)
     */

    public static void countUniqueWorld(String text) {

        Map<String, Integer> map = new HashMap<>();
        String[] inputTxtAndSplit = text.split(" +");
        for (String t : inputTxtAndSplit) {
            if (map.containsKey(t)) {
                map.put(t, map.get(t) + 1);
            } else {
                map.put(t, 1);
            }
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.println(key);
                System.out.println(map.get(key));
            }
        }

        System.out.println(map.keySet());
        System.out.println(map.size());
    }

    public static int reversNumber(int number) {
        int rest;
        int revers = 0;
        while (number != 0) {

            rest = number % 10;
            number = number / 10;
            revers = revers * 10 + rest;
            // System.out.println(revers);
        }

        return revers;
    }

    public static void reversUsingRecursion(int number) {
        int rest;
        int revers;
        rest = number % 10;
        number = number / 10;
        System.out.print(rest);
        if (number != 0) {
            reversUsingRecursion(number);
        }

    }

    /**
     * задание на уроке-ввести число ,перевернуть и вывести его
     */
    public static int reversNumber1(int number) {

        int revers = 0;
        while (number != 0) {
            int ostatok = number % 10;
            number = number / 10;
            revers = revers * 10 + ostatok;
            System.out.println("число с которым работаем " + ostatok);
            System.out.println("оставшееся число " + number);
            System.out.println("перевернутый результат " + revers);
            System.out.println("\n");

        }
        return revers;
    }

    /**
     * Task подсчитать слова которые не повторяются
     */
    public static int countWorld1(String text) {
        int count = 0;

        String[] worlds = (text.split(" "));
        for (int a = 0; a < worlds.length; a++) {
            String compare1 = worlds[a];
            int compare1Occurance = 0;
            for (int i = 0; i < worlds.length; i++) {
                if (i != a) {
                    String compare = worlds[i];
                    if (compare.equals(compare1)) {
                        compare1Occurance++;
                        //System.out.println(compare);
                    }
                }
            }
            // System.out.println(compare1 + " " + compare1Occurance);
            if (compare1Occurance == 0) {
                count++;
            }

        }
        // System.out.println(count);
        return count;


    }
}



