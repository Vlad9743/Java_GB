package org.example.homework3.task1;

import org.example.sem3.task3.Cube;

import java.util.ArrayList;
import java.util.List;

/*
Дан массив записей: наименование товара, цена, сорт.
Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший».
 */
public class main {
    public static void main(String[] args) {
        List<Product> products = getProducts();

        float maxPriceFirstSort = 0;
        float maxPriceSecondSort = 0;
        for (Product item : products) {
            if (item.sort.contains("высший")){
                if (item.sort.contains("первый") && item.price > maxPriceFirstSort){
                    maxPriceFirstSort = item.price;
                }
                if (item.sort.contains("второй") && item.price > maxPriceSecondSort){
                    maxPriceSecondSort = item.price;
                }
            }
        }
        System.out.println("maxPriceFirstSort = " + maxPriceFirstSort);
        System.out.println("maxPriceSecondSort = " + maxPriceSecondSort);
    }

    public static ArrayList<Product> getProducts(){
        ArrayList<Product> products= new ArrayList<>();
        products.add(new Product("яблоко", 57, "первый"));
        products.add(new Product("яйцо", 124, "первый высший"));
        products.add(new Product("сельдь", 257, "второй"));
        products.add(new Product("банан", 46, "второй высший"));
        products.add(new Product("рис", 74, "третий"));
        products.add(new Product("крупа гречневая", 67, "второй"));
        products.add(new Product("томат", 114, "третий"));
        products.add(new Product("хлеб ржаной", 56, "высший второй"));
        products.add(new Product("молоко", 187, "первый но не высший"));
        products.add(new Product("кефир", 134, "высший"));
        return products;
    }
}
