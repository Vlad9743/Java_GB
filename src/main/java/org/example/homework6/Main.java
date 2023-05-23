package org.example.homework6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Set<Notebook> notebooksSet = setNotebooksBase("notes.txt");
        printNotebooksSet(notebooksSet);
        HashMap<Integer,String> filterMap = setFilter();
        printFilterResult(notebooksSet, filterMap);

    }
    public static HashMap<Integer, String> setFilter(){
        HashMap<Integer,String> filterMapLoc = new HashMap<>();
        Scanner scannerLoc = new Scanner(System.in);

        boolean end = true;
        while (end){
            System.out.print("Для задания фильтра введите номер параметра или 11 для завершения ввода: ");
            int key = scannerLoc.nextInt();
            if(key == 11){
                end = false;
            } else {
                System.out.print("Введите (минимальное) значение параметра: ");
                String value = scannerLoc.next();
                filterMapLoc.put(key, value);
            }
        }
        scannerLoc.close();
        return filterMapLoc;
    }

    public static HashSet<Notebook> setNotebooksBase(String fileName) throws FileNotFoundException {
        HashSet<Notebook> notebooksSetLoc = new HashSet<>();
        File file = new File("src/main/java/org/example/homework6/" + fileName);
        String content;
        Scanner scanner = new Scanner(file);
        content = scanner.useDelimiter("\\A").next();

        String[] strings = content.split("\n");

        for (int i = 0; i < strings.length; i++) {
            String[] words = strings[i].split(" ");
            notebooksSetLoc.add(new Notebook(words[0], words[1], words[2], Integer.valueOf(words[3]), Integer.valueOf(words[4]), words[5].strip()));
        }
        scanner.close();
        return notebooksSetLoc;
    }

    public static void printNotebooksSet(Set<Notebook> notebooksSetLoc){
        System.out.println("В базе данных есть следующие ноутбуки:");
        System.out.println();
        System.out.println("  (1)  |       (2)      | (3)|(4)| (5) | (6) ");
        System.out.println("---------------------------------------------");
        System.out.println("  Код  |  Производитель | CPU|RAM| HDD | Цвет ");
        System.out.println("---------------------------------------------");
        for (Notebook item : notebooksSetLoc){
            System.out.println(item);
        }
        System.out.println();
    }

    public static void printFilterResult(Set<Notebook> notebookSetLoc, HashMap<Integer,String> filterMapLoc){
        System.out.println();
        System.out.println("Результаты поиска: ");
        for (Notebook item : notebookSetLoc){
            if(item.matchChecker(filterMapLoc)){
                System.out.println(item);
            }
        }
    }
}
