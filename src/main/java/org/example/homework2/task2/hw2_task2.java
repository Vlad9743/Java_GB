package org.example.homework2.task2;

//2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.

import java.util.Scanner;

public class hw2_task2 {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел в последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        boolean isRaising = true;

        int a = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            int b = scanner.nextInt();
            if (b < a){
                isRaising = false;
            }
            a = b;
        }
        if (isRaising)
            System.out.println("Последовательность возрастающая.");
        else
            System.out.println("Последовательность не возрастающая.");
    }
}
