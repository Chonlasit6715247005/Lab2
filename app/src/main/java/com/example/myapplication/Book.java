package com.example.myapplication;

public class Book {
    // Attribute
    String title;
    String author;
    int numberOfPages;

    // Method
    void read() {
        System.out.println("Reading the book...");
    }

    void describe() {
        if (this.title == null || this.title.isEmpty()) {
            System.out.println("This book has no title.");
        } else {
            System.out.println("Book title: " + this.title + ", Author: " + this.author + ", Pages: " + numberOfPages);
        }
    }

    void changeTitle(String newTitle) {
        this.title = newTitle;
    }
}
