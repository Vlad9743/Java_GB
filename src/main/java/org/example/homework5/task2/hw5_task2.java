package org.example.homework5.task2;

//2) Пусть дан список сотрудников
//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

import java.util.*;

public class hw5_task2 {
    public static void main(String[] args) {

        String names = "Иван Иванов,Светлана Петрова,Кристина Белова,Анна Мусина,Анна Крутова,Иван Юрин,Петр Лыков,Павел Чернов,Петр Чернышов,Мария Федорова,Марина Светлова,Мария Савина,Мария Рыкова,Марина Лугова,Анна Владимирова,Иван Мечников,Петр Петин,Иван Ежов";
        List<String> nameslList = new ArrayList<>(Arrays.asList(names.split(",")));
        Map<String, Integer> mapOfNames = new TreeMap<>();

        for (int i = 0; i < nameslList.size(); i++) {
            mapOfNames.putIfAbsent(Arrays.asList(nameslList.get(i).split(" ")).get(0), 0);
            mapOfNames.put(Arrays.asList(nameslList.get(i).split(" ")).get(0), mapOfNames.get(Arrays.asList(nameslList.get(i).split(" ")).get(0)) + 1);
        }

        ArrayList<Integer> listOfValues = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapOfNames.entrySet()){
            listOfValues.add(entry.getValue());
        }
        Collections.sort(listOfValues, Collections.reverseOrder());

        LinkedHashMap<String, Integer> sortedMapOfNames = new LinkedHashMap<>();
        for (int num : listOfValues) {
            for (Map.Entry<String, Integer> entry : mapOfNames.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMapOfNames.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMapOfNames);
    }
}
