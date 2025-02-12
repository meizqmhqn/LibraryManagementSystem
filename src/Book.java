package com.library;

public class Book extends LibraryItem {
    private String ISBN;
    private int year;

    public Book(String title, String author, String ISBN, int year) {
        super(title, author);
        this.ISBN = ISBN;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " by " + getAuthor() + ", ISBN: " + ISBN + ", Year: " + year);
    }

    @Override
    public String toString() {
        return super.toString() + ", ISBN=" + ISBN + ", Year=" + year;
    }
}
