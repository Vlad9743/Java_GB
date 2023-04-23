package org.example.homework3.task4;

import java.util.*;

/*
4. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class task4Main {
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array1.add(random.nextInt(51));
        }
        System.out.println(array1);
        System.out.println("Min value: " + Collections.min(array1));
        System.out.println("Max value: " + Collections.max(array1));

        IntSummaryStatistics stat1 = array1.stream().mapToInt(num -> num).summaryStatistics();
        System.out.println("Average value: " + stat1.getAverage());
    }
}
