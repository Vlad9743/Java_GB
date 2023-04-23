package org.example.homework3.task3;

import java.util.ArrayList;
import java.util.List;

/*
Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class task3Main {
    public static void main(String[] args) {
        List<Books> books = getBooks();

        for (Books item : books) {
            if (item.author.contains("А") && item.publishYear >= 2010 && proveMeSimple(item.pages)){
                System.out.println(item.name);
            }
        }
     }

    public static ArrayList<Books> getBooks(){
        ArrayList<Books> books = new ArrayList<>();
        books.add(new Books("Книга1", "Азимов", 123, 2010, 149));
        books.add(new Books("Книга2", "Толстой", 313, 1996, 426));
        books.add(new Books("Книга3", "Лем", 345, 1988, 683));
        books.add(new Books("Книга4", "Бредбери", 568, 1983, 135));
        books.add(new Books("Книга5", "Оруэл", 346, 1976, 341));
        books.add(new Books("Книга6", "Стругацкий", 136, 1982, 124));
        books.add(new Books("Книга6", "Андерсон", 352, 1986, 123));
        books.add(new Books("Книга7", "Дик", 268, 1987, 234));
        books.add(new Books("Книга8", "Акутагава", 683, 2018, 151));
        books.add(new Books("Книга9", "Кобе", 247, 1986, 362));
        books.add(new Books("Книга10", "Джойс", 843, 1974, 366));
        return books;
    }

    public static boolean proveMeSimple(int number){
        boolean check = true;
        int i = 2;
        int end = (int)Math.round(Math.sqrt(number));
        while (check && i <= end){
            if (number % i == 0){
                check = false;
            }
            i++;
        }
        return check;
    }
}
