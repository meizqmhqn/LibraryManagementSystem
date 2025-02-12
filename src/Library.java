package com.library;

import java.util.*;

public class Library {
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (LibraryItem item : items) {
            item.displayInfo();
        }
    }

    public List<LibraryItem> filterBooksByTitle(String keyword) {
        return items.stream()
                .filter(item -> item instanceof Book && item.getTitle().contains(keyword))
                .collect(Collectors.toList());
    }

    public LibraryItem findBookByTitle(String title) {
        for (LibraryItem item : items) {
            if (item instanceof Book && item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null;
    }

    public void sortItemsByTitle() {
        items.sort(Comparator.comparing(LibraryItem::getTitle));
    }

    public void sortItemsByYear() {
        items.sort(Comparator.comparingInt(item -> ((Book) item).getYear()));
    }
}


