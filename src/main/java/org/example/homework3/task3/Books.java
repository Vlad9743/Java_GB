package org.example.homework3.task3;

public class Books {
    String name;
    String author;
    float price;
    int publishYear;
    int pages;

    public Books(String name, String author, float price, int publishYear, int pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.publishYear = publishYear;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Books{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", publishYear=" + publishYear +
                ", pages=" + pages +
                '}';
    }
}
