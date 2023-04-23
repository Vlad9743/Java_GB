package org.example.homework3.task2;

public class Goods {
    String name;
    String country;
    float weight;
    float price;
    String sort;

    public Goods(String name, String country, float weight, float price, String sort) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                '}';
    }
}
