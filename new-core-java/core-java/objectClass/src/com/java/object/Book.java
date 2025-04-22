package com.java.object;
import java.util.Objects;
public class Book {

    private String title;
    private double price;
    private int pages;
    private char grade;

    public Book(String title, double price, int pages, char grade) {
        this.title = title;
        this.price = price;
        this.pages = pages;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + ", price=" + price +", pages=" + pages + ", grade='" + grade  + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            Book other = (Book) obj;
            if (Objects.equals(this.title, other.title) &&
                    Objects.equals(this.price, other.price)) {
                System.out.println("Book is matching..");
                return true;
            }
        }
        return false;
    }
}
