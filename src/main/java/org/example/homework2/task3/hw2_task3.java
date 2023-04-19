package org.example.homework2.task3;

//3) Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.

import java.util.Arrays;
import java.util.Scanner;

public class hw2_task3 {
    public static void main(String[] args) {
        System.out.print("Введите длину массива: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int myArray[] = new int[arraySize];

        int twoDigitSum = 0;
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = scanner.nextInt();
            if (myArray[i] >= 10 && myArray[i] <= 100){
                twoDigitSum += i;
            }
        }
        System.out.println("Исходный массив" + Arrays.toString(myArray));

        for (int i = 0; i < arraySize; i++){
            if (myArray[i] < 0){
                myArray[i] = twoDigitSum;
            }
        }
        System.out.println("Преобразованный массив" + Arrays.toString(myArray));
    }
}
