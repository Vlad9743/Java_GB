package org.example.homework1.task2;

import java.util.Scanner;

//2) Дана последовательность целых чисел, оканчивающаяся нулем. Найти сумму положительных чисел,
// после которых следует отрицательное число.

public class hw1_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (b != 0) {
            if (a > 0 && b < 0) {
                sum += a;
            }
            a = b;
            b = scanner.nextInt();
        }
        scanner.close();
        System.out.println(sum);
    }
}
