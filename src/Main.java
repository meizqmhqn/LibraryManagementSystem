package com.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("1984", "George Orwell", "12345", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "67890", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "11223", 1925);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(book3);

        // Фильтрация книг по названию
        System.out.println("Filtered Books:");
        library.filterBooksByTitle("1984").forEach(book -> book.displayInfo());

        // Линейный поиск книги
        LibraryItem foundBook = library.findBookByTitle("1984");
        if (foundBook != null) {
            System.out.println("Found: " + foundBook);
        }

        // Сортировка книг по году издания
        System.out.println("\nSorted Books by Year:");
        library.sortItemsByYear();
        library.displayAllItems();
    }
}
