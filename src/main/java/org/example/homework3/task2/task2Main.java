package org.example.homework3.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class task2Main {
    public static void main(String[] args) {
        List<Goods> goods = getGoods();
        List<Goods> tempList = new ArrayList<>();

        System.out.print("Введите сорт: ");
        Scanner scanner = new Scanner(System.in);
        String sortToSearch = scanner.next();
        scanner.close();

        for (Goods item : goods) {
            if (item.sort.equals(sortToSearch)){
                tempList.add(item);
            }
        }

        float minPrice = tempList.get(0).price;
        for (Goods item : tempList) {
            if (item.price < minPrice){
                minPrice = item.price;
            }
        }

        for (Goods item : tempList) {
            if (item.price == minPrice){
                System.out.println(item.name);;
            }
        }
    }

    public static ArrayList<Goods> getGoods(){
        ArrayList<Goods> goods = new ArrayList<>();
        goods.add(new Goods("стул1", "Франция", 5, 9, "первый"));
        goods.add(new Goods("стул2", "Германия", 8, 24, "второй"));
        goods.add(new Goods("стул3", "Италия", 28, 116, "третий"));
        goods.add(new Goods("стул4", "Китай", 12, 98, "первый"));
        goods.add(new Goods("стол1", "Китай", 2, 27, "второй"));
        goods.add(new Goods("стол2", "Китай", 18, 46, "третий"));
        goods.add(new Goods("стол3", "Китай", 2, 23, "первый"));
        goods.add(new Goods("стол4", "США", 1.5f, 57, "первый"));
        goods.add(new Goods("шкаф1", "Мексика", 3.4f, 46, "третий"));
        goods.add(new Goods("шкаф2", "Япония", 9, 12, "второй"));
        goods.add(new Goods("шкаф3", "Япония", 9, 12, "второй"));
        goods.add(new Goods("шкаф4", "Япония", 9, 9, "первый"));
        return goods;
    }
}
