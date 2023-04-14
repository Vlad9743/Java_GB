package org.example.homework1.task1;

//Given an input string s, reverse the order of the words.

import java.util.Arrays;

public class hw1_task1 {
    public static void main(String[] args) {
        String initialString = "  the    sky is blue  ";
        System.out.println(wordsReverse(initialString));
    }

    /**
     *
     * @param givenString - исходная строка
     * @return - возвращает фразу с обратным порядком слов
     */
    public static String wordsReverse(String givenString)
    {
        givenString = givenString.trim();
        String reversedString = "";
        String[] words = givenString.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i] != "") {
                reversedString += words[i].trim();
                reversedString += " ";
            }
        }
        reversedString = reversedString.trim();
        return reversedString;
    }

}
