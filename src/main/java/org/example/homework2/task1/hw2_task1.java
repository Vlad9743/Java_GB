package org.example.homework2.task1;

//1) Дана последовательность N целых чисел. Найти сумму простых чисел.

import java.util.Scanner;

public class hw2_task1 {
    public static void main(String[] args) {
        System.out.print("Введите количество чисел в последовательности: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            sum += proveMeSimple(number);
        }
        System.out.println("Сумма простых чисел в последовательности: " + sum);
    }

    /**
     *
     * @param num - проверяемое число
     * @return - вернет num, если число простое, 0 - в противном случае
     */

    public static int proveMeSimple(int num){
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                num = 0;
                break;
            }
        }
        return num;
    }
}
