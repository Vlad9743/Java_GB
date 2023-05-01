package org.example.homework4.task1;

import java.util.Arrays;
import java.util.LinkedList;

//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
public class hw4_task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        while (list1.peekFirst() != null){
            int temp = list1.removeLast();

            System.out.print(temp + " -> ");
        }
    }

}
