package org.example.homework5.task1;

import java.util.*;

//Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово будет являться ключом),
// вносить все слова не нужно
public class hw5_task1 {
    public static void main(String[] args) {
        String originalStr = "Россия идет впереди,,, всей планеты. Планета - это не Россия. иДет, идет и идет";
        StringBuilder processedStr = new StringBuilder(originalStr.toLowerCase());
        String forbiddenSymbols = ".,-!?:;";
        for (int i = 0; i < processedStr.length(); i++) {
            if (forbiddenSymbols.contains("" + processedStr.charAt(i))){
                processedStr.deleteCharAt(i);
                i--;
            }
        }

        List<String> words = new ArrayList<>(Arrays.asList(processedStr.toString().split(" ")));

        System.out.print("Введите искомое слово: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toLowerCase();

        Map<String, Integer> wordCount = new HashMap<>();
        wordCount.put(word, 0);

        for (String s : words){
            if (s.equals(word)){
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        System.out.println("В тексте слово встречается " + wordCount.get(word) + " раз.");
    }
}
