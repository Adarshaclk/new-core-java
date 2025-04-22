package com.java.inherMtd.internal;

class Book {
    private String title;
    private int pages;

    protected Book(String title, int pages) {
        System.out.println("running inside the Book CONST");
        this.title = title;
        this.pages = pages;
    }

    void setBook(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void read() {
        System.out.println("running inside the read method");
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", pages=" + pages + '}';
    }
}
